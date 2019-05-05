package com.weike.education.mvp.contract.app

import com.weike.education.base.BaseContract
import com.weike.education.mvp.model.app.VerticalBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签界面
 *
 */
interface SelectionTypeContract {
    interface View : BaseContract.BaseView {
        fun showVertical(verticalBean: VerticalBean)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {
        fun getVertical(tag: Int)
    }
}