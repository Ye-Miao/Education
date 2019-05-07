package com.weike.education.ui.activity.app

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
import com.weike.education.mvp.contract.app.MainContract
import com.weike.education.mvp.model.TabEntity
import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.model.app.TagBean
import com.weike.education.mvp.model.app.TagSuccessBean
import com.weike.education.mvp.presenter.app.MainPresenter
import com.weike.education.ui.fragment.app.DiscoveryFragment
import com.weike.education.ui.fragment.course.CourseFragment
import com.weike.education.ui.fragment.mine.MineFragment
import com.weike.education.utils.StatusBarUtil
import com.weike.education.utils.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : BaseInjectActivity<MainPresenter>(), OnTabSelectListener, MainContract.View {

    private val CHOOSE_REQUEST_CODE = 1
    private var exitTime = 0L
    private var mCurrentPos = -1
    private val numbers = ArrayList<Int>()
    private var mFragments = mutableListOf<Fragment>()
    private var mTabEntities = ArrayList<CustomTabEntity>()
    private lateinit var mTagBean: TagBean
    private var title: String? = null

    private val mTitles = arrayOf("发现课程", "我的课程", "我的账户")

    // 未被选中的图标
    private val mIconUnSelectIds = intArrayOf(R.drawable.tab_discover, R.drawable.tab_my_course, R.drawable.tab_mine)
    // 被选中的图标
    private val mIconSelectIds = intArrayOf(R.drawable.tab_discover_checked, R.drawable.tab_my_course_checked, R.drawable.tab_mine_checked)

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initInject() = activityComponent.inject(this)

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initWidget() {
        super.initWidget()
        // 作用：我的账户的状态栏延伸至最顶部
        StatusBarUtil.setTranslucentForImageView(this, 0, null)
        StatusBarUtil.setLightMode(this)

        (0 until mTitles.size)
                .mapTo(mTabEntities) { TabEntity(mTitles[it], mIconSelectIds[it], mIconUnSelectIds[it]) }


        bottom_main.setTabData(mTabEntities)
        bottom_main.setOnTabSelectListener(this)
    }

    override fun loadData() {
        numbers.add(432)
        numbers.add(1228)
        mPresenter.getRegionTagTypeBean(numbers) // 初始值默认为中学
    }

    override fun showDiscoveryBean(mDiscoveryCommentBean: DiscoveryCommentBean) {
        val stages = mDiscoveryCommentBean.data.stages
        val hostObject = JsonParser().parse(Gson().toJson(stages)).asJsonObject
        var nextId: String? = null
        var result = JsonObject()

        stages.`154271985`.subTags.forEach {
            if (it.tagId == numbers[0]) {
                nextId = it.nextStage
            }
        }

        hostObject.keySet().forEach {
            if (it == nextId) {
                val json = hostObject.getAsJsonObject(it)
                val mSubTags = Gson().fromJson(json, TagBean::class.java)
                mSubTags.subTags.forEach { subTag ->
                    if (subTag.tagId == numbers[1]) {
                        title = subTag.tagName
                        result = hostObject.getAsJsonObject(subTag.nextStage)
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

    override fun onTabSelect(position: Int) = switchFragmentIndex(position)


    override fun onTabReselect(position: Int) {}

    private fun switchFragmentIndex(index: Int) {
        // 特别注意，fragment重叠问题，mCurrentPos是上一个fragment,index是当前fragment
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
                CHOOSE_REQUEST_CODE -> {
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
