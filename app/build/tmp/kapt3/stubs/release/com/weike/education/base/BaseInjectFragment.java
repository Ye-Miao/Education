package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/8
 * * desc: 基础InjectFragment
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/weike/education/base/BaseInjectFragment;", "T", "Lcom/weike/education/base/BaseContract$BasePresenter;", "Lcom/weike/education/base/BaseFragment;", "Lcom/weike/education/base/BaseContract$BaseView;", "()V", "fragmentComponent", "Lcom/weike/education/di/component/FragmentComponent;", "getFragmentComponent", "()Lcom/weike/education/di/component/FragmentComponent;", "fragmentModule", "Lcom/weike/education/di/module/FragmentModule;", "getFragmentModule", "()Lcom/weike/education/di/module/FragmentModule;", "mPresenter", "getMPresenter", "()Lcom/weike/education/base/BaseContract$BasePresenter;", "setMPresenter", "(Lcom/weike/education/base/BaseContract$BasePresenter;)V", "Lcom/weike/education/base/BaseContract$BasePresenter;", "complete", "", "onDestroy", "showError", "msg", "", "app_release"})
public abstract class BaseInjectFragment<T extends com.weike.education.base.BaseContract.BasePresenter<?>> extends com.weike.education.base.BaseFragment implements com.weike.education.base.BaseContract.BaseView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public T mPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final T getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.weike.education.di.module.FragmentModule getFragmentModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.weike.education.di.component.FragmentComponent getFragmentComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void complete() {
    }
    
    public BaseInjectFragment() {
        super();
    }
}