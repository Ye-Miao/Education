package com.weike.education.mvp.model.course

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/4
 * desc:
 *
 */
data class VideoBean(val code: String, val `data`: Data, val msg: String) {

    data class Data(val video: List<Video>) {

        data class Video(
                val articleUrl: String, val courseId: Int,
                val endTime: Long, val id: String, val img: String,
                val opId: Int, val purchased: Boolean, val rank: Int,
                val tagId: Int, val title: String, val type: String,
                val url: String, val urlId: String, val urlType: String,
                val validTime: Long, val videoUrl: String, val viewed: Int)
    }
}
