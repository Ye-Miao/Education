package com.weike.education.rx;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/28
 * * desc: RxBus事件发送订阅类
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J(\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010J \u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/weike/education/rx/RxBus;", "", "()V", "bus", "Lio/reactivex/processors/FlowableProcessor;", "getBus", "()Lio/reactivex/processors/FlowableProcessor;", "post", "", "o", "toDefaultFlowable", "Lio/reactivex/disposables/Disposable;", "T", "eventType", "Ljava/lang/Class;", "act", "Lio/reactivex/functions/Consumer;", "toFlowable", "Lio/reactivex/Flowable;", "app_debug"})
public final class RxBus {
    @org.jetbrains.annotations.NotNull()
    private static final io.reactivex.processors.FlowableProcessor<java.lang.Object> bus = null;
    public static final com.weike.education.rx.RxBus INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.processors.FlowableProcessor<java.lang.Object> getBus() {
        return null;
    }
    
    public final void post(@org.jetbrains.annotations.NotNull()
    java.lang.Object o) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Flowable<T> toFlowable(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> eventType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.disposables.Disposable toDefaultFlowable(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> eventType, @org.jetbrains.annotations.NotNull()
    io.reactivex.functions.Consumer<T> act) {
        return null;
    }
    
    private RxBus() {
        super();
    }
}