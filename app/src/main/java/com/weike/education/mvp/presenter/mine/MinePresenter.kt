package com.weike.education.mvp.presenter.mine

import com.weike.education.base.BaseSubscriber
import com.weike.education.base.RxPresenter
import com.weike.education.mvp.model.mine.MineBean
import com.weike.education.mvp.contract.mine.MineContract
import com.weike.education.network.helper.RetrofitHelper
import com.weike.education.utils.rxSchedulerHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc: 我的-MinePresenter
 *
 */
class MinePresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<MineContract.View>(), MineContract.Presenter<MineContract.View> {

    override fun getMine() {
        val subscriber = mRetrofitHelper.getMine()
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<MineBean>(mView) {
                    override fun onSuccess(mData: MineBean) {
                        mView?.showMine(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}