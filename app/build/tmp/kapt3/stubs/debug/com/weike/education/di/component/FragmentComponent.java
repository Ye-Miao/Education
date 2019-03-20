package com.weike.education.di.component;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: FragmentComponent
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/weike/education/di/component/FragmentComponent;", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "inject", "", "discoveryFragment", "Lcom/weike/education/model/app/DiscoveryFragment;", "selectionFragment", "Lcom/weike/education/model/app/SectionFragment;", "selectionTypeFragment", "Lcom/weike/education/model/app/SectionTypeFragment;", "courseCategoryFragment", "Lcom/weike/education/model/course/CourseCategoryFragment;", "mineFragment", "Lcom/weike/education/model/mine/MineFragment;", "app_debug"})
@dagger.Component(dependencies = {com.weike.education.di.component.ApiComponent.class}, modules = {com.weike.education.di.module.FragmentModule.class})
@com.weike.education.di.scope.FragmentScope()
public abstract interface FragmentComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Activity getActivity();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.DiscoveryFragment discoveryFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.SectionFragment selectionFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.app.SectionTypeFragment selectionTypeFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.mine.MineFragment mineFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.weike.education.model.course.CourseCategoryFragment courseCategoryFragment);
}