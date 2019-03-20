package com.weike.education.network.helper;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: RetrofitHelper
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/weike/education/network/helper/RetrofitHelper;", "", "mApiService", "Lcom/weike/education/network/api/ApiService;", "(Lcom/weike/education/network/api/ApiService;)V", "getDiscoveryComment", "Lio/reactivex/Flowable;", "Lcom/weike/education/bean/app/DiscoveryCommentBean;", "getMine", "Lcom/weike/education/bean/mine/MineBean;", "getSelection", "Lcom/weike/education/bean/app/SelectionBean;", "getVertical", "Lcom/weike/education/bean/app/VerticalBean;", "tag", "", "getVideo", "Lcom/weike/education/bean/course/VideoBean;", "setTag", "Lcom/weike/education/bean/app/TagSuccessBean;", "tagList", "", "", "app_debug"})
public final class RetrofitHelper {
    private final com.weike.education.network.api.ApiService mApiService = null;
    
    /**
     * *****************************ApiService 
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.app.DiscoveryCommentBean> getDiscoveryComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.app.VerticalBean> getVertical(int tag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.app.TagSuccessBean> setTag(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> tagList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.app.SelectionBean> getSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.mine.MineBean> getMine() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.weike.education.bean.course.VideoBean> getVideo() {
        return null;
    }
    
    public RetrofitHelper(@org.jetbrains.annotations.NotNull()
    com.weike.education.network.api.ApiService mApiService) {
        super();
    }
}