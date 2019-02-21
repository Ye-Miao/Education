package com.weike.education.di.component;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: ApiComponent
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/di/component/ApiComponent;", "", "retrofitHelper", "Lcom/weike/education/network/helper/RetrofitHelper;", "getRetrofitHelper", "()Lcom/weike/education/network/helper/RetrofitHelper;", "app_release"})
@dagger.Component(modules = {com.weike.education.di.module.ApiModule.class})
@javax.inject.Singleton()
public abstract interface ApiComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.weike.education.network.helper.RetrofitHelper getRetrofitHelper();
}