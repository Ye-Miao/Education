package com.weike.education.mvp.presenter.course

import com.weike.education.base.BaseSubscriber
import com.weike.education.base.RxPresenter
import com.weike.education.mvp.contract.course.CourseCategoryContract
import com.weike.education.mvp.model.course.VideoBean
import com.weike.education.network.helper.RetrofitHelper
import com.weike.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc: 我的课程-CourseCategoryPresenter
 *
 */
class CourseCategoryPresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<CourseCategoryContract.View>(), CourseCategoryContract.Presenter<CourseCategoryContract.View> {

    override fun getVideo() {
        val subscriber = mRetrofitHelper.getVideo()
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<VideoBean>(mView) {
                    override fun onSuccess(mData: VideoBean) {
                        mView?.showVideo(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}