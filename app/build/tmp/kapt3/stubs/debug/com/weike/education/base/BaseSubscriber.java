package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/14
 * * desc: 统一处理订阅者
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/weike/education/base/BaseSubscriber;", "T", "Lio/reactivex/subscribers/ResourceSubscriber;", "view", "Lcom/weike/education/base/BaseContract$BaseView;", "msg", "", "(Lcom/weike/education/base/BaseContract$BaseView;Ljava/lang/String;)V", "(Lcom/weike/education/base/BaseContract$BaseView;)V", "onComplete", "", "onError", "e", "", "onFailure", "code", "", "message", "onNext", "response", "(Ljava/lang/Object;)V", "onStart", "onSuccess", "mData", "app_debug"})
public abstract class BaseSubscriber<T extends java.lang.Object> extends io.reactivex.subscribers.ResourceSubscriber<T> {
    private java.lang.String msg;
    private final com.weike.education.base.BaseContract.BaseView view = null;
    
    public abstract void onSuccess(T mData);
    
    public void onFailure(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onNext(T response) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public BaseSubscriber(@org.jetbrains.annotations.Nullable()
    com.weike.education.base.BaseContract.BaseView view) {
        super();
    }
    
    public BaseSubscriber(@org.jetbrains.annotations.Nullable()
    com.weike.education.base.BaseContract.BaseView view, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
        super();
    }
}