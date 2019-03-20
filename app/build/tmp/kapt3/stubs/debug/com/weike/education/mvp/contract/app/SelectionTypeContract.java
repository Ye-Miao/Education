package com.weike.education.mvp.contract.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/29
 * * desc: 标签界面
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/weike/education/mvp/contract/app/SelectionTypeContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SelectionTypeContract {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/mvp/contract/app/SelectionTypeContract$View;", "Lcom/weike/education/base/BaseContract$BaseView;", "showVertical", "", "verticalBean", "Lcom/weike/education/bean/app/VerticalBean;", "app_debug"})
    public static abstract interface View extends com.weike.education.base.BaseContract.BaseView {
        
        public abstract void showVertical(@org.jetbrains.annotations.NotNull()
        com.weike.education.bean.app.VerticalBean verticalBean);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/weike/education/mvp/contract/app/SelectionTypeContract$Presenter;", "T", "Lcom/weike/education/base/BaseContract$BasePresenter;", "getVertical", "", "tag", "", "app_debug"})
    public static abstract interface Presenter<T extends java.lang.Object> extends com.weike.education.base.BaseContract.BasePresenter<T> {
        
        public abstract void getVertical(int tag);
    }
}