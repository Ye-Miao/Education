package com.weike.education.ui.activity.app

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.weike.education.R
import com.weike.education.ui.adapter.app.ChoosePhaseAdapter
import com.weike.education.base.BaseInjectActivity
import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.model.app.TagBean
import com.weike.education.mvp.contract.app.ChoosePhaseContract
import com.weike.education.mvp.presenter.app.ChoosePhasePresenter
import com.weike.education.utils.AppUtils
import com.weike.education.utils.StatusBarUtil
import com.zhy.view.flowlayout.FlowLayout
import com.zhy.view.flowlayout.TagAdapter
import kotlinx.android.synthetic.main.activity_select_phase.*
import kotlinx.android.synthetic.main.common_tag.view.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: 选择阶段
 *
 */
class ChoosePhaseActivity : BaseInjectActivity<ChoosePhasePresenter>(), ChoosePhaseContract.View {

    private lateinit var mStages: DiscoveryCommentBean.Data.Stages
    private lateinit var numbers: ArrayList<Int>
    private lateinit var mTagBean: TagBean
    private var leftId = 0
    private var mPosition = -1
    private val mAdapter: ChoosePhaseAdapter by lazy {
        ChoosePhaseAdapter(R.layout.choose_left_item, null)
    }

    override fun getLayoutId(): Int = R.layout.activity_select_phase

    override fun initInject() = activityComponent.inject(this)

    override fun initPresenter() = mPresenter.attachView(this)

    override fun loadData() = mPresenter.getDiscoveryComment()

    override fun initWidget() {
        StatusBarUtil.setColorNoTranslucent(this, AppUtils.getColor(R.color.white))
        intent?.let {
            numbers = intent.getIntegerArrayListExtra("number")
        }

        mAdapter.setOnItemChildClickListener { _, _, position ->
            leftId = mStages.`154271985`.subTags[position].tagId
            mPosition = -1
            switchScreen()
        }
    }

    override fun showDiscoveryComment(mData: DiscoveryCommentBean) {
        mStages = mData.data.stages
        mAdapter.addData(mStages.`154271985`.subTags)
        left.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        left.adapter = mAdapter
        leftId = numbers[0]
        switchScreen()
    }

    private fun switchScreen() {
        val hostObject = JsonParser().parse(Gson().toJson(mStages)).asJsonObject
        var nextId: String? = null

        mStages.`154271985`.subTags.forEach {
            if (it.tagId == leftId) {
                nextId = it.nextStage
                switchCategory(mStages.`154271985`.subTags.indexOf(it))
            }
        }

        hostObject.keySet().forEach {
            if (it == nextId) {
                val json = hostObject.getAsJsonObject(it)
                mTagBean = Gson().fromJson(json, TagBean::class.java)
                mTagBean.subTags.forEach { subTag ->
                    if (subTag.tagId == numbers[1]) {
                        mPosition = mTagBean.subTags.indexOf(subTag)
                    }
                }
                switchRepresent(mTagBean)
            }
        }
    }

    private fun switchRepresent(mTagBean: TagBean) {
        val titles = arrayListOf<String>()
        val tagId = arrayListOf<Int>()
        for (message in mTagBean.subTags) {
            titles.add(message.tagName)
            tagId.add(message.tagId)
        }
        initTagLayout(titles, tagId)
    }

    private fun initTagLayout(titles: List<String>, tagId: List<Int>) {
        mTflRepresent.adapter = object : TagAdapter<String>(titles) {
            override fun getView(parent: FlowLayout?, position: Int, title: String?): View {
                val mTagLayout = LayoutInflater.from(mContext)
                        .inflate(R.layout.common_tag, parent, false)
                mTagLayout.mTvTag.text = title
                if (position == mPosition) {
                    mTagLayout.mTvTag.setTextColor(AppUtils.getColor(R.color.tab_textSelectColor))
                    mTagLayout.cardView.setCardBackgroundColor(AppUtils.getColor(R.color.bg_green))
                } else {
                    mTagLayout.mTvTag.setTextColor(AppUtils.getColor(R.color.bottom_textUnSelectColor))
                    mTagLayout.cardView.setCardBackgroundColor(AppUtils.getColor(R.color.white))
                }
                return mTagLayout
            }
        }

        mTflRepresent.setOnTagClickListener { _, position, _ ->
            val intent = Intent()
            intent.putExtra("tagId", leftId)
            intent.putExtra("nextId", tagId[position])
            setResult(RESULT_OK, intent)
            finish()
            true
        }
    }

    private fun switchCategory(position: Int) {
        mAdapter.selectedPosition = position
        mAdapter.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_choose, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_close -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}