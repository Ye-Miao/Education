package com.weike.education.mvp.contract.app

import com.weike.education.base.BaseContract
import com.weike.education.mvp.model.app.DiscoveryCommentBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: 选择阶段
 *
 */
interface ChoosePhaseContract {
    interface View : BaseContract.BaseView {
        fun showDiscoveryComment(mData: DiscoveryCommentBean)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {
        fun getDiscoveryComment()
    }
}