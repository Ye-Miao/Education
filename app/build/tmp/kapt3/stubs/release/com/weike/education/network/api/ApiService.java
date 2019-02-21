package com.weike.education.network.api;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/12
 * * desc: Api接口类
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/weike/education/network/api/ApiService;", "", "discoveryComment", "Lio/reactivex/Flowable;", "Lcom/weike/education/bean/app/DiscoveryCommentBean;", "getDiscoveryComment", "()Lio/reactivex/Flowable;", "mine", "Lcom/weike/education/bean/mine/MineBean;", "getMine", "selection", "Lcom/weike/education/bean/app/SelectionBean;", "getSelection", "video", "Lcom/weike/education/bean/course/VideoBean;", "getVideo", "getVertical", "Lcom/weike/education/bean/app/VerticalBean;", "tag", "", "setTag", "Lcom/weike/education/bean/app/TagSuccessBean;", "tags", "", "", "app_release"})
public abstract interface ApiService {
    
    /**
     * * 首页层次（学习阶段分层）
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/content/stages?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.bean.app.DiscoveryCommentBean> getDiscoveryComment();
    
    /**
     * * 获取相应Tag页面的内容(tag由上面接口获取)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/vertical2?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.bean.app.VerticalBean> getVertical(@retrofit2.http.Query(value = "tag")
    int tag);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/user/profile/tag/set?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.bean.app.TagSuccessBean> setTag(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Object> tags);
    
    /**
     * * 获取精选内容
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/apphome?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1440x2560&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android&popup=false")
    public abstract io.reactivex.Flowable<com.weike.education.bean.app.SelectionBean> getSelection();
    
    /**
     * * 获取头像，名字
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/user_status.jsonp?&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.bean.mine.MineBean> getMine();
    
    /**
     * * 获取视频流
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/course3/api/content/video?api_ver=2.0&rank=0&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    public abstract io.reactivex.Flowable<com.weike.education.bean.course.VideoBean> getVideo();
}