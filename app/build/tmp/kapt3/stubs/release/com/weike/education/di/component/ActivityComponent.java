package com.weike.education.di.component;

import java.lang.System;

/**
 * * @author: ym
 * * date: 2018/9/10
 * * desc:ActivityComponent
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/weike/education/di/component/ActivityComponent;", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "inject", "", "Lcom/weike/education/model/app/ChoosePhaseActivity;", "Lcom/weike/education/model/app/MainActivity;", "Lcom/weike/education/model/app/SectionDetailActivity;", "app_release"})
@dagger.Component(dependencies = {com.weike.education.di.component.ApiComponent.class}, modules = {com.weike.education.di.module.ActivityModule.class})
@com.weike.education.di.scope.ActivityScope()
public abstract interface ActivityComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Activity getActivity();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.ChoosePhaseActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.SectionDetailActivity activity);
}