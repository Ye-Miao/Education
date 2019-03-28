package com.weike.education.rx

import com.weike.education.utils.rxSchedulerHelper
import io.reactivex.Flowable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.processors.FlowableProcessor
import io.reactivex.processors.PublishProcessor

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: RxBus事件发送订阅类
 *
 */

object RxBus {
    // PublishSubject只会把在订阅发生的时间点之后来自原始Flowable的数据发射给观察者
    val bus: FlowableProcessor<Any> = PublishProcessor.create<Any>().toSerialized()

    // 提供了一个新的事件 发射数据
    fun post(o: Any) = bus.onNext(o)

    // 根据传递的 eventType 类型返回特定类型(eventType)的 被观察者
    fun <T> toFlowable(eventType: Class<T>): Flowable<T> = bus.ofType(eventType)

    // 封装默认订阅
    fun <T> toDefaultFlowable(eventType: Class<T>, act: Consumer<T>): Disposable = bus.ofType(eventType).compose(rxSchedulerHelper<T>()).subscribe(act)
}
