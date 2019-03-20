package com.weike.education.di.module;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: Activity模型
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/weike/education/di/module/ActivityModule;", "", "mActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getMActivity", "()Landroid/app/Activity;", "provideActivity", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity mActivity = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.weike.education.di.scope.ActivityScope()
    @dagger.Provides()
    public final android.app.Activity provideActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getMActivity() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
        super();
    }
}