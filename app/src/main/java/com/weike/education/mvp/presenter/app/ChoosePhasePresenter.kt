package com.weike.education.mvp.presenter.app

import com.weike.education.base.BaseSubscriber
import com.weike.education.base.RxPresenter
import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.contract.app.ChoosePhaseContract
import com.weike.education.network.helper.RetrofitHelper
import com.weike.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: 选择阶段
 *
 */
class ChoosePhasePresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<ChoosePhaseContract.View>(), ChoosePhaseContract.Presenter<ChoosePhaseContract.View> {

    override fun getDiscoveryComment() {
        val subscriber = mRetrofitHelper.getDiscoveryComment()
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<DiscoveryCommentBean>(mView) {
                    override fun onSuccess(mData: DiscoveryCommentBean) {
                        mView?.showDiscoveryComment(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}