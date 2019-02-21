package com.weike.education.di.module;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: Fragment模型
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/di/module/FragmentModule;", "", "mFragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "getMFragment", "()Landroid/support/v4/app/Fragment;", "provideActivity", "Landroid/app/Activity;", "app_release"})
@dagger.Module()
public final class FragmentModule {
    @org.jetbrains.annotations.NotNull()
    private final android.support.v4.app.Fragment mFragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.weike.education.di.scope.FragmentScope()
    @dagger.Provides()
    public final android.app.Activity provideActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.app.Fragment getMFragment() {
        return null;
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment mFragment) {
        super();
    }
}