package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/7
 * * desc: 基础BaseActivity
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H&J\u001f\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\u0012\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u0016H\u0014J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\'H\u0015J\u001f\u0010+\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019\u00a2\u0006\u0002\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/weike/education/base/BaseActivity;", "Lcom/trello/rxlifecycle2/components/support/RxAppCompatActivity;", "()V", "mBack", "", "getMBack", "()Z", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mToolbar", "Landroid/support/v7/widget/Toolbar;", "getMToolbar", "()Landroid/support/v7/widget/Toolbar;", "setMToolbar", "(Landroid/support/v7/widget/Toolbar;)V", "getLayoutId", "", "gone", "", "views", "", "Landroid/view/View;", "([Landroid/view/View;)V", "inVisible", "initInject", "initPresenter", "initRecyclerView", "initStatusBar", "initToolbar", "initVariables", "initWidget", "loadData", "loadDatas", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "visible", "app_debug"})
public abstract class BaseActivity extends com.trello.rxlifecycle2.components.support.RxAppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.Toolbar mToolbar;
    private final boolean mBack = true;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final android.content.Context getMContext() {
        return null;
    }
    
    protected final void setMContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.support.v7.widget.Toolbar getMToolbar() {
        return null;
    }
    
    protected final void setMToolbar(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.Toolbar p0) {
    }
    
    protected boolean getMBack() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void initVariables() {
    }
    
    public void loadDatas() {
    }
    
    public void initPresenter() {
    }
    
    public void initInject() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public void initToolbar() {
    }
    
    private final void initStatusBar() {
    }
    
    public abstract int getLayoutId();
    
    /**
     * * 初始化控件
     */
    public void initWidget() {
    }
    
    /**
     * * 加载数据
     */
    public void loadData() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void initRecyclerView() {
    }
    
    /**
     * * 隐藏View
     *     * @param views 视图
     */
    public final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    /**
     * * 显示View 不占位置
     *     * @param views 视图
     */
    public final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    /**
     * * 显示View
     *     * @param views 视图
     */
    public final void inVisible(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    public BaseActivity() {
        super();
    }
}