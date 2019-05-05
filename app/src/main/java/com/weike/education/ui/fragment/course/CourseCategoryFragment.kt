package com.weike.education.ui.fragment.course

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.weike.education.R
import com.weike.education.ui.adapter.course.CourseCategoryAdapter
import com.weike.education.base.BaseRefreshFragment
import com.weike.education.mvp.model.course.VideoBean
import com.weike.education.Constants
import com.weike.education.mvp.contract.course.CourseCategoryContract
import com.weike.education.mvp.presenter.course.CourseCategoryPresenter

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/30
 * desc: 全部课程
 *
 */
class CourseCategoryFragment : BaseRefreshFragment<CourseCategoryPresenter, VideoBean>(), CourseCategoryContract.View {

    private var mVideoList = ArrayList<VideoBean.Data.Video>()
    private var mAdapter: CourseCategoryAdapter? = null

    override fun getLayoutId(): Int = R.layout.fragment_course_category

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initInject() = fragmentComponent.inject(this)

    override fun lazyLoadData() = mPresenter.getVideo()

    companion object {
        fun newInstance(id: Int): CourseCategoryFragment {
            val fragment = CourseCategoryFragment()
            val bundle = Bundle()
            bundle.putInt(Constants.EXTRA_POSITION, id)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun initRecyclerView() {
        mAdapter = CourseCategoryAdapter(mVideoList)
        mRecycler?.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        mRecycler?.adapter = mAdapter
    }

    override fun showVideo(videoBean: VideoBean) {
        mVideoList.addAll(videoBean.data.video)
        finishTask()
    }

    override fun finishTask() {
        mAdapter?.notifyDataSetChanged()
    }
}