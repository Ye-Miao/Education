package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/9
 * * desc: 基础刷新Fragment
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\"H\u0014J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0004J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006)"}, d2 = {"Lcom/weike/education/base/BaseRefreshActivity;", "T", "Lcom/weike/education/base/BaseContract$BasePresenter;", "K", "Lcom/weike/education/base/BaseInjectActivity;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "mIsRefreshing", "", "getMIsRefreshing", "()Z", "setMIsRefreshing", "(Z)V", "mList", "", "getMList", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mLoading", "Lcom/weike/education/utils/ProgressWheel;", "mRecycler", "Landroid/support/v7/widget/RecyclerView;", "getMRecycler", "()Landroid/support/v7/widget/RecyclerView;", "setMRecycler", "(Landroid/support/v7/widget/RecyclerView;)V", "mRefresh", "Landroid/support/v4/widget/SwipeRefreshLayout;", "getMRefresh", "()Landroid/support/v4/widget/SwipeRefreshLayout;", "setMRefresh", "(Landroid/support/v4/widget/SwipeRefreshLayout;)V", "clear", "", "clearData", "complete", "initRefreshLayout", "initWidget", "loadDatas", "onRefresh", "app_debug"})
public abstract class BaseRefreshActivity<T extends com.weike.education.base.BaseContract.BasePresenter<?>, K extends java.lang.Object> extends com.weike.education.base.BaseInjectActivity<T> implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener {
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView mRecycler;
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.widget.SwipeRefreshLayout mRefresh;
    private boolean mIsRefreshing;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<K> mList;
    private com.weike.education.utils.ProgressWheel mLoading;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final android.support.v7.widget.RecyclerView getMRecycler() {
        return null;
    }
    
    protected final void setMRecycler(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.support.v4.widget.SwipeRefreshLayout getMRefresh() {
        return null;
    }
    
    protected final void setMRefresh(@org.jetbrains.annotations.Nullable()
    android.support.v4.widget.SwipeRefreshLayout p0) {
    }
    
    protected final boolean getMIsRefreshing() {
        return false;
    }
    
    protected final void setMIsRefreshing(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<K> getMList() {
        return null;
    }
    
    protected final void setMList(@org.jetbrains.annotations.Nullable()
    java.util.List<K> p0) {
    }
    
    protected final void initRefreshLayout() {
    }
    
    @java.lang.Override()
    public void initWidget() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    protected void clearData() {
    }
    
    @java.lang.Override()
    public void complete() {
    }
    
    protected void clear() {
    }
    
    @java.lang.Override()
    public void loadDatas() {
    }
    
    public BaseRefreshActivity() {
        super();
    }
}