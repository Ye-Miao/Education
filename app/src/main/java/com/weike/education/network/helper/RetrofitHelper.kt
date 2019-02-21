package com.weike.education.network.helper

import com.weike.education.bean.app.DiscoveryCommentBean
import com.weike.education.bean.app.SelectionBean
import com.weike.education.bean.app.TagSuccessBean
import com.weike.education.bean.app.VerticalBean
import com.weike.education.bean.course.VideoBean
import com.weike.education.bean.mine.MineBean
import com.weike.education.network.api.ApiService
import io.reactivex.Flowable

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: RetrofitHelper
 */
class RetrofitHelper(private val mApiService: ApiService) {

    /*******************************ApiService *********************************/

    //首页层次（学习阶段分层）
    fun getDiscoveryComment(): Flowable<DiscoveryCommentBean> = mApiService.discoveryComment

    //获取相应Tag页面的内容
    fun getVertical(tag: Int): Flowable<VerticalBean> = mApiService.getVertical(tag)

    //提交精选内容相应区别参数
    fun setTag(tagList: Map<String, Any>): Flowable<TagSuccessBean> = mApiService.setTag(tagList)

    //获取精选内容
    fun getSelection(): Flowable<SelectionBean> = mApiService.selection

    //获取头像内容,名字
    fun getMine(): Flowable<MineBean> = mApiService.mine

    //获取视频流
    fun getVideo(): Flowable<VideoBean> = mApiService.video
}



