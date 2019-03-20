package com.weike.education.mvp.presenter.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/16
 * * desc: 主界面-MainPresenter
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/weike/education/mvp/presenter/app/MainPresenter;", "Lcom/weike/education/base/RxPresenter;", "Lcom/weike/education/mvp/contract/app/MainContract$View;", "Lcom/weike/education/mvp/contract/app/MainContract$Presenter;", "mRetrofitHelper", "Lcom/weike/education/network/helper/RetrofitHelper;", "(Lcom/weike/education/network/helper/RetrofitHelper;)V", "getRegionTagTypeBean", "", "tagId", "Ljava/util/ArrayList;", "", "app_debug"})
public final class MainPresenter extends com.weike.education.base.RxPresenter<com.weike.education.mvp.contract.app.MainContract.View> implements com.weike.education.mvp.contract.app.MainContract.Presenter<com.weike.education.mvp.contract.app.MainContract.View> {
    private final com.weike.education.network.helper.RetrofitHelper mRetrofitHelper = null;
    
    @java.lang.Override()
    public void getRegionTagTypeBean(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> tagId) {
    }
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.weike.education.network.helper.RetrofitHelper mRetrofitHelper) {
        super();
    }
}