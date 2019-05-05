package com.weike.education.mvp.presenter.app

import com.weike.education.base.BaseSubscriber
import com.weike.education.base.RxPresenter
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.mvp.contract.app.SelectionTypeContract
import com.weike.education.network.helper.RetrofitHelper
import com.weike.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签界面
 *
 */
class SelectionTypePresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<SelectionTypeContract.View>(), SelectionTypeContract.Presenter<SelectionTypeContract.View> {

    override fun getVertical(tag: Int) {
        val subscriber = mRetrofitHelper.getVertical(tag)
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<VerticalBean>(mView) {
                    override fun onSuccess(mData: VerticalBean) {
                        mView?.showVertical(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}