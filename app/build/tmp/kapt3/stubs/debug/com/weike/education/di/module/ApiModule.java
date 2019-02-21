package com.weike.education.di.module;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc:Api网络模型
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/weike/education/di/module/ApiModule;", "", "()V", "createRetrofit", "Lretrofit2/Retrofit;", "builder", "Lretrofit2/Retrofit$Builder;", "client", "Lokhttp3/OkHttpClient;", "baseUrl", "", "provideApiService", "Lcom/weike/education/network/api/ApiService;", "retrofit", "provideAppRetrofit", "provideOkHttpClient", "provideRetrofitBuilder", "provideRetrofitHelper", "Lcom/weike/education/network/helper/RetrofitHelper;", "apiService", "app_debug"})
@dagger.Module()
public final class ApiModule {
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit createRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder builder, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.weike.education.network.helper.RetrofitHelper provideRetrofitHelper(@org.jetbrains.annotations.NotNull()
    com.weike.education.network.api.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.weike.education.di.qualifier.AppUrl()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideAppRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder builder, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.weike.education.network.api.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    @com.weike.education.di.qualifier.AppUrl()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public ApiModule() {
        super();
    }
}