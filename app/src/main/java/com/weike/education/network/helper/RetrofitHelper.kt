package com.weike.education.network.helper

import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.model.app.SelectionBean
import com.weike.education.mvp.model.app.TagSuccessBean
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.mvp.model.course.VideoBean
import com.weike.education.mvp.model.mine.MineBean
import com.weike.education.network.api.ApiService
import io.reactivex.Flowable

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: RetrofitHelper
 */
class RetrofitHelper(private val mApiService: ApiService) {

    /*******************************ApiService *********************************/

    // 首页层次（学习阶段分层）
    fun getDiscoveryComment(): Flowable<DiscoveryCommentBean> = mApiService.getDiscoveryCommentData()

    // 获取相应Tag页面的内容
    fun getVertical(tag: Int): Flowable<VerticalBean> = mApiService.getVertical(tag)

    // 提交精选内容相应区别参数
    fun setTag(tagList: ArrayList<Int>): Flowable<TagSuccessBean> = mApiService.setTag(tagList)

    // 获取精选内容
    fun getSelection(): Flowable<SelectionBean> = mApiService.getSelectionData()

    // 获取头像内容,名字
    fun getMine(): Flowable<MineBean> = mApiService.getMineData()

    // 获取视频流
    fun getVideo(): Flowable<VideoBean> = mApiService.getVideoData()
}

