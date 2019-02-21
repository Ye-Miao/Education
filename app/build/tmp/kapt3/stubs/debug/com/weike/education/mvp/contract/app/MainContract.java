package com.weike.education.mvp.contract.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/16
 * * desc: 主界面- MainContract
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/weike/education/mvp/contract/app/MainContract;", "", "Presenter", "View", "app_debug"})
public abstract interface MainContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/mvp/contract/app/MainContract$View;", "Lcom/weike/education/base/BaseContract$BaseView;", "showDiscoveryBean", "", "mDiscoveryCommentBean", "Lcom/weike/education/bean/app/DiscoveryCommentBean;", "showSetTag", "tagSuccessBean", "Lcom/weike/education/bean/app/TagSuccessBean;", "app_debug"})
    public static abstract interface View extends com.weike.education.base.BaseContract.BaseView {
        
        public abstract void showDiscoveryBean(@org.jetbrains.annotations.NotNull()
        com.weike.education.bean.app.DiscoveryCommentBean mDiscoveryCommentBean);
        
        public abstract void showSetTag(@org.jetbrains.annotations.NotNull()
        com.weike.education.bean.app.TagSuccessBean tagSuccessBean);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/mvp/contract/app/MainContract$Presenter;", "T", "Lcom/weike/education/base/BaseContract$BasePresenter;", "getRegionTagTypeBean", "", "tagId", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface Presenter<T extends java.lang.Object> extends com.weike.education.base.BaseContract.BasePresenter<T> {
        
        /**
         * * @param  tagId    [所处阶段Id,阶段对应级别（如初中->初一、初二、初三）]
         *         * @return
         */
        public abstract void getRegionTagTypeBean(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> tagId);
    }
}