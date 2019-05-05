package com.weike.education.ui.fragment.app

import android.support.v7.widget.LinearLayoutManager
import com.weike.education.R
import com.weike.education.base.BaseRefreshFragment
import com.weike.education.mvp.contract.app.SelectionContract
import com.weike.education.mvp.model.app.SelectionBean
import com.weike.education.mvp.presenter.app.SelectionPresenter
import com.weike.education.ui.adapter.app.section.SectionBanner
import com.weike.education.ui.adapter.app.section.SectionCourse
import com.weike.education.ui.adapter.app.section.SectionSerial
import com.weike.education.ui.adapter.app.section.SectionSpecial
import com.weike.education.widget.section.SectionedRVAdapter

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/19
 * desc: 精选界面
 *
 */
class SectionFragment : BaseRefreshFragment<SelectionPresenter, SelectionBean>(), SelectionContract.View {

    private val mHeaderList = ArrayList<SelectionBean.Data.Head>() // 顶部banner
    private val mSpecialList = ArrayList<SelectionBean.Data.Zhuanlan>() // 名师推荐
    private val mSerialList = ArrayList<SelectionBean.Data.Serial>() // 系列好课
    private val mVideoList = ArrayList<SelectionBean.Data.Video>() // 好课抢先看
    private val mCourseList = ArrayList<SelectionBean.Data.Course>() // 精选好课
    private var mSectionedAdapter: SectionedRVAdapter? = null

    override fun getLayoutId(): Int = R.layout.fragment_selection

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initInject() = fragmentComponent.inject(this)

    override fun lazyLoadData() = mPresenter.getSelection()

    companion object {
        fun newInstance(): SectionFragment {
            return SectionFragment()
        }
    }

    override fun initRecyclerView() {
        mSectionedAdapter = SectionedRVAdapter()
        val mLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        mRecycler?.layoutManager = mLayoutManager
        mRecycler?.adapter = mSectionedAdapter
    }

    override fun clear() {
        mHeaderList.clear()
        mSpecialList.clear()
        mSerialList.clear()
        mVideoList.clear()
        mCourseList.clear()
        mSectionedAdapter?.removeAllSections()
    }

    override fun showSelection(selectionBean: SelectionBean) {
        mHeaderList.addAll(selectionBean.data.head)
        mSpecialList.addAll(selectionBean.data.zhuanlan)
        mSerialList.addAll(selectionBean.data.serial)
        mVideoList.addAll(selectionBean.data.video)
        mCourseList.addAll(selectionBean.data.course)
        finishTask()
    }

    override fun finishTask() {
        if (mHeaderList.size != 0) mSectionedAdapter?.addSection(SectionBanner(mHeaderList))
        if (mSpecialList.size != 0) mSectionedAdapter?.addSection(SectionSpecial(mSpecialList))
        if (mSerialList.size != 0) mSectionedAdapter?.addSection(SectionSerial(mSerialList))
        if (mCourseList.size != 0) mSectionedAdapter?.addSection(SectionCourse(mCourseList))
        mSectionedAdapter?.notifyDataSetChanged()
    }
}
