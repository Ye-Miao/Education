package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/12
 * * desc: 基于Rx的Presenter封装,控制订阅的生命周期
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0001\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0006\u0010\u001e\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/weike/education/base/RxPresenter;", "T", "Lcom/weike/education/base/BaseContract$BaseView;", "Lcom/weike/education/base/BaseContract$BasePresenter;", "()V", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setMCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "mView", "getMView", "()Lcom/weike/education/base/BaseContract$BaseView;", "setMView", "(Lcom/weike/education/base/BaseContract$BaseView;)V", "Lcom/weike/education/base/BaseContract$BaseView;", "addRxBusSubscribe", "", "K", "eventType", "Ljava/lang/Class;", "act", "Lio/reactivex/functions/Consumer;", "addSubscribe", "disposable", "Lio/reactivex/disposables/Disposable;", "attachView", "view", "detachView", "unSubscribe", "app_release"})
public class RxPresenter<T extends com.weike.education.base.BaseContract.BaseView> implements com.weike.education.base.BaseContract.BasePresenter<T> {
    @org.jetbrains.annotations.Nullable()
    private T mView;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.CompositeDisposable mCompositeDisposable;
    
    @org.jetbrains.annotations.Nullable()
    public final T getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.CompositeDisposable getMCompositeDisposable() {
        return null;
    }
    
    public final void setMCompositeDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    public final void unSubscribe() {
    }
    
    public final void addSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final <K extends java.lang.Object>void addRxBusSubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.Class<K> eventType, @org.jetbrains.annotations.NotNull()
    io.reactivex.functions.Consumer<K> act) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    T view) {
    }
    
    public RxPresenter() {
        super();
    }
}