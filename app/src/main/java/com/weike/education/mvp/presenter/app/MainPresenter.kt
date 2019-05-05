package com.weike.education.mvp.presenter.app

import com.weike.education.base.BaseSubscriber
import com.weike.education.base.RxPresenter
import com.weike.education.mvp.contract.app.MainContract
import com.weike.education.mvp.model.app.TagSuccessBean
import com.weike.education.network.helper.RetrofitHelper
import com.weike.education.utils.rxSchedulerHelper
import java.util.*
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/16
 * desc: 主界面-MainPresenter
 *
 */
class MainPresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<MainContract.View>(), MainContract.Presenter<MainContract.View> {

    override fun getRegionTagTypeBean(tagId: ArrayList<Int>) {
        val subscriber = mRetrofitHelper.getDiscoveryComment()
                .flatMap {
                    mView?.showDiscoveryBean(it)
                    mRetrofitHelper.setTag(tagId)
                }
                .compose(rxSchedulerHelper())
                .subscribeWith(object : BaseSubscriber<TagSuccessBean>(mView) {
                    override fun onSuccess(mData: TagSuccessBean) {
                        mView?.showSetTag(mData)
                    }
                })
        addSubscribe(subscriber)
    }
}
