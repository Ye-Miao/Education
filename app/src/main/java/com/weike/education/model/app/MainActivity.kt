package com.weike.education.model.app

import android.content.Intent
import android.support.v4.app.Fragment
import android.view.KeyEvent
import com.flyco.tablayout.listener.CustomTabEntity
import com.flyco.tablayout.listener.OnTabSelectListener
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.weike.education.App
import com.weike.education.R
import com.weike.education.base.BaseInjectActivity
import com.weike.education.bean.TabEntity
import com.weike.education.bean.app.DiscoveryCommentBean
import com.weike.education.bean.app.TagBean
import com.weike.education.bean.app.TagSuccessBean
import com.weike.education.model.course.CourseFragment
import com.weike.education.model.mine.MineFragment
import com.weike.education.mvp.contract.app.MainContract
import com.weike.education.mvp.presenter.app.MainPresenter
import com.weike.education.utils.StatusBarUtil
import com.weike.education.utils.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : BaseInjectActivity<MainPresenter>(), OnTabSelectListener, MainContract.View {

    private val CHOOSE_REQUESTCODE = 1
    private var exitTime = 0L
    private var mCurrentPos: Int = -1
    private val numbers = ArrayList<Int>()
    private var mFragments = mutableListOf<Fragment>()
    private var mTabEntities = ArrayList<CustomTabEntity>()
    private lateinit var stages: DiscoveryCommentBean.Data.Stages
    private lateinit var mTagBean: TagBean
    private var title: String? = null

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initInject() = activityComponent.inject(this)

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initWidget() {
        super.initWidget()
        //作用：我的账户的状态栏延伸至最顶部
        StatusBarUtil.setTranslucentForImageView(this, 0, null)
        //StatusBarUtil.setColorNoTranslucent(this,AppUtils.getColor(R.color.white))
        StatusBarUtil.setLightMode(this)
        //底部tab
        mTabEntities.add(TabEntity("发现课程", R.drawable.tab_discover_checked, R.drawable.tab_discover))
        mTabEntities.add(TabEntity("我的课程", R.drawable.tab_my_course_checked, R.drawable.tab_my_course))
        mTabEntities.add(TabEntity("我的账户", R.drawable.tab_mine_checked, R.drawable.tab_mine))
        bottom_main.setTabData(mTabEntities)
        bottom_main.setOnTabSelectListener(this)
    }

    override fun loadData() {
        numbers.add(432)
        numbers.add(1228)
        mPresenter.getRegionTagTypeBean(numbers) //初始值默认为中学
    }

    override fun showDiscoveryBean(mDiscoveryCommentBean: DiscoveryCommentBean) {
        stages = mDiscoveryCommentBean.data.stages
        val hostObject = JsonParser().parse(Gson().toJson(stages)).asJsonObject
        var nextId: String? = null
        var result = JsonObject()
        for (stages in stages.`154271985`.subTags) {
            if (numbers[0] == stages.tagId) {
                nextId = stages.nextStage
                break
            }
        }
        for (article in hostObject.keySet()) {
            if (nextId == article) {
                val json = hostObject.getAsJsonObject(article)
                val mSubTags = Gson().fromJson(json, TagBean::class.java)
                for (tag in mSubTags.subTags) {
                    if (numbers[1] == tag.tagId) {
                        title = tag.tagName
                        result = hostObject.getAsJsonObject(tag.nextStage)
                        break
                    }
                }
            }
        }
        mTagBean = Gson().fromJson(result, TagBean::class.java)
    }

    override fun showSetTag(tagSuccessBean: TagSuccessBean) {
        mFragments = Arrays.asList(
                DiscoveryFragment.newInstance(mTagBean, numbers, title),
                CourseFragment.newInstance(),
                MineFragment.newInstance()
        )
        switchFragmentIndex(0)
    }

    override fun onTabSelect(position: Int) {
        //底部按钮切换
        switchFragmentIndex(position)
    }

    override fun onTabReselect(position: Int) {
    }

    private fun switchFragmentIndex(index: Int) {
        //特别注意，fragment重叠问题，mCurrentPos是上一个fragment,index是当前fragment
        supportFragmentManager
                .beginTransaction()
                .apply {
                    if (mCurrentPos != -1)
                        hide(mFragments[mCurrentPos])
                    if (!mFragments[index].isAdded) {
                        add(R.id.fl_content, mFragments[index])
                    }
                    show(mFragments[index]).commit()
                    mCurrentPos = index
                }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            when (requestCode) {
                CHOOSE_REQUESTCODE -> {
                    val bundle = data?.extras
                    bundle?.let {
                        numbers.clear()
                        numbers.add(it.getInt("tagId"))
                        numbers.add(it.getInt("nextId"))
                        mPresenter.getRegionTagTypeBean(numbers)
                    }
                }
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitApp()
        }
        return true
    }

    private fun exitApp() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            ToastUtils.showToast("再按一次退出应用")
            exitTime = System.currentTimeMillis()
        } else {
            App.instance.exitApp()
        }
    }
}
