package com.weike.education.ui.fragment.app

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.weike.education.R
import com.weike.education.ui.adapter.app.section.SectionTypeBanner
import com.weike.education.ui.adapter.app.section.SectionTypeColumn
import com.weike.education.ui.adapter.app.section.SectionTypeSubTag
import com.weike.education.base.BaseRefreshFragment
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.Constants
import com.weike.education.mvp.contract.app.SelectionTypeContract
import com.weike.education.mvp.presenter.app.SelectionTypePresenter
import com.weike.education.widget.section.SectionedRVAdapter

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/20
 * desc: 标签界面
 *
 */
class SectionTypeFragment : BaseRefreshFragment<SelectionTypePresenter, VerticalBean>(), SelectionTypeContract.View {

    private var mTid = 0
    private val mHeaderList = ArrayList<VerticalBean.Data.Banner>() // 顶部Banner
    private val mSubTagList = ArrayList<VerticalBean.Data.SubTag>() // 顶部tab列表
    private val mColumnList = ArrayList<VerticalBean.Data.Column>() // 列表item内容
    private var mSectionedAdapter: SectionedRVAdapter? = null

    override fun getLayoutId(): Int = R.layout.fragment_selection_type

    override fun initInject() = fragmentComponent.inject(this)

    override fun initPresenter() = mPresenter.attachView(this)

    override fun lazyLoadData() = mPresenter.getVertical(mTid)

    companion object {
        fun newInstance(tid: Int): SectionTypeFragment {
            val fragment = SectionTypeFragment()
            val bundle = Bundle()
            bundle.putInt(Constants.EXTRA_TID, tid)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun initVariables() {
        arguments?.let {
            mTid = it.getInt(Constants.EXTRA_TID)
        }
    }

    override fun clear() {
        mHeaderList.clear()
        mSubTagList.clear()
        mColumnList.clear()
        mSectionedAdapter?.removeAllSections()
    }

    override fun initRecyclerView() {
        mSectionedAdapter = SectionedRVAdapter()
        mRecycler?.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        mRecycler?.adapter = mSectionedAdapter
    }

    override fun showVertical(verticalBean: VerticalBean) {
        mHeaderList.addAll(verticalBean.data.banner)
        mColumnList.addAll(verticalBean.data.column)
        mSubTagList.addAll(verticalBean.data.subTag)
        finishTask()
    }

    override fun finishTask() {
        if (mHeaderList.size != 0) mSectionedAdapter?.addSection(SectionTypeBanner(mHeaderList))
        if (mSubTagList.size != 0) mSectionedAdapter?.addSection(SectionTypeSubTag(mSubTagList))
        mColumnList.forEach {
            mSectionedAdapter?.addSection(SectionTypeColumn(it.title, it.courseCards))
        }
        mSectionedAdapter?.notifyDataSetChanged()
    }
}