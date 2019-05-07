package com.weike.education.network.api;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: Api接口类
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\'J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0018\b\u0001\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0012j\b\u0012\u0004\u0012\u00020\f`\u0013H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/weike/education/network/api/ApiService;", "", "getDiscoveryCommentData", "Lio/reactivex/Flowable;", "Lcom/weike/education/mvp/model/app/DiscoveryCommentBean;", "getMineData", "Lcom/weike/education/mvp/model/mine/MineBean;", "getSelectionData", "Lcom/weike/education/mvp/model/app/SelectionBean;", "getVertical", "Lcom/weike/education/mvp/model/app/VerticalBean;", "tag", "", "getVideoData", "Lcom/weike/education/mvp/model/course/VideoBean;", "setTag", "Lcom/weike/education/mvp/model/app/TagSuccessBean;", "tagList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface ApiService {
    
    /**
     * * 首页层次（学习阶段分层）
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/content/stages?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.app.DiscoveryCommentBean> getDiscoveryCommentData();
    
    /**
     * * 获取相应Tag页面的内容(tag由上面接口获取)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/vertical2?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.app.VerticalBean> getVertical(@retrofit2.http.Query(value = "tag")
    int tag);
    
    /**
     * * 修改当前学习阶段
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/user/profile/tag/set?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.app.TagSuccessBean> setTag(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tags")
    java.util.ArrayList<java.lang.Integer> tagList);
    
    /**
     * * 获取精选内容
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/apphome?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1440x2560&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android&popup=false")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.app.SelectionBean> getSelectionData();
    
    /**
     * * 获取头像，名字
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/user_status.jsonp?&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.mine.MineBean> getMineData();
    
    /**
     * * 获取视频流
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/content/video?api_ver=2.0&rank=0&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.mvp.model.course.VideoBean> getVideoData();
}