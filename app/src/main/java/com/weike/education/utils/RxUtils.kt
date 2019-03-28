package com.weike.education.utils

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.FlowableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/12
 * desc:
 *
 */

/**
 * 统一线程处理
 *
 * @param <T>
 * @return
</T> */
fun <T> rxSchedulerHelper(): FlowableTransformer<T, T> =
        FlowableTransformer { observable ->
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
        } // compose简化线程 统一处理线程

/**
 * 生成Flowable
 *
 * @param <T>
 * @return
</T> */
fun <T> createData(t: T): Flowable<T> {
    return Flowable.create({ emitter ->
        try {
            emitter.onNext(t)
            emitter.onComplete()
        } catch (e: Exception) {
            emitter.onError(e)
        }
    }, BackpressureStrategy.BUFFER)
}

/**
 * 生成Flowable
 *
 * @param <T>
 * @return
</T> */
fun <T> createData(t: List<T>): Flowable<List<T>> {
    return Flowable.create({ emitter ->
        try {
            emitter.onNext(t)
            emitter.onComplete()
        } catch (e: Exception) {
            emitter.onError(e)
        }
    }, BackpressureStrategy.BUFFER)
}

