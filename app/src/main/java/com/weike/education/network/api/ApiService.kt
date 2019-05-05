package com.weike.education.network.api

import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.model.app.SelectionBean
import com.weike.education.mvp.model.app.TagSuccessBean
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.mvp.model.course.VideoBean
import com.weike.education.mvp.model.mine.MineBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Api接口类
 */
interface ApiService {

    /**
     * 首页层次（学习阶段分层）
     */
    @GET("/course3/api/content/stages?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    fun getDiscoveryCommentData(): Flowable<DiscoveryCommentBean>

    /**
     * 获取相应Tag页面的内容(tag由上面接口获取)
     */

    @GET("/course3/api/vertical2?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    fun getVertical(@Query("tag") tag: Int): Flowable<VerticalBean>

    /**
     * 修改当前学习阶段
     */
    @GET("/course3/api/user/profile/tag/set?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    fun setTag(@Query("tags") tagList: ArrayList<Int>): Flowable<TagSuccessBean>

    /**
     * 获取精选内容
     */
    @GET("/course3/api/apphome?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1440x2560&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android&popup=false")
    fun getSelectionData(): Flowable<SelectionBean>

    /**
     * 获取头像，名字
     */
    @GET("/api/user_status.jsonp?&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    fun getMineData(): Flowable<MineBean>

    /**
     * 获取视频流
     */
    @GET("/course3/api/content/video?api_ver=2.0&rank=0&keyfrom=course.3.2.4.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    fun getVideoData(): Flowable<VideoBean>
}
