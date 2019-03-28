package com.weike.education.mvp.contract.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2019/1/5
 * * desc:
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/weike/education/mvp/contract/app/SectionDetailContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SectionDetailContract {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/weike/education/mvp/contract/app/SectionDetailContract$View;", "Lcom/weike/education/base/BaseContract$BaseView;", "app_debug"})
    public static abstract interface View extends com.weike.education.base.BaseContract.BaseView {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/weike/education/mvp/contract/app/SectionDetailContract$Presenter;", "T", "Lcom/weike/education/base/BaseContract$BasePresenter;", "app_debug"})
    public static abstract interface Presenter<T extends java.lang.Object> extends com.weike.education.base.BaseContract.BasePresenter<T> {
    }
}