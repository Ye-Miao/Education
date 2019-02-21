package com.weike.education.base;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/7
 * * desc: 基础Contract
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/weike/education/base/BaseContract;", "", "BasePresenter", "BaseView", "app_release"})
public abstract interface BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/weike/education/base/BaseContract$BaseView;", "", "complete", "", "showError", "msg", "", "app_release"})
    public static abstract interface BaseView {
        
        /**
         * *  请求错误
         */
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
        
        public abstract void complete();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/weike/education/base/BaseContract$BasePresenter;", "T", "", "attachView", "", "view", "(Ljava/lang/Object;)V", "detachView", "app_release"})
    public static abstract interface BasePresenter<T extends java.lang.Object> {
        
        /**
         * * 绑定
         *         *
         *         * @param view view
         */
        public abstract void attachView(T view);
        
        /**
         * * 解绑
         */
        public abstract void detachView();
    }
}