package com.weike.education.base

import com.weike.education.rx.RxBus
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc: 基于Rx的Presenter封装,控制订阅的生命周期
 *
 */
open class RxPresenter<T : BaseContract.BaseView> : BaseContract.BasePresenter<T> {

    var mView: T? = null
    var mCompositeDisposable: CompositeDisposable? = null

    fun unSubscribe() {
        mCompositeDisposable?.let { mCompositeDisposable?.dispose() }
    }

    fun addSubscribe(disposable: Disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable?.add(disposable)
    }

    fun <K> addRxBusSubscribe(eventType: Class<K>, act: Consumer<K>) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable?.add(RxBus.toDefaultFlowable(eventType, act))
    }

    override fun detachView() {
        this.mView = null
        unSubscribe()
    }

    override fun attachView(view: T) {
        this.mView = view
    }
}