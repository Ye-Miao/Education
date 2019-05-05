package com.weike.education.mvp.contract.course

import com.weike.education.base.BaseContract
import com.weike.education.mvp.model.course.VideoBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc:
 *
 */
interface CourseCategoryContract {
    interface View : BaseContract.BaseView {
        fun showVideo(videoBean: VideoBean)
    }
    interface Presenter<in T> : BaseContract.BasePresenter<T> {
        fun getVideo()
    }
}