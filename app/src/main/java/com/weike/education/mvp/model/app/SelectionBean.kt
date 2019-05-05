package com.weike.education.mvp.model.app

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/19
 * desc: 精选
 *
 */
data class SelectionBean(val code: String, val `data`: Data, val msg: String) {

    data class Data(
            val course: List<Course>, val `extra-home-1`: ExtraHome1, val head: List<Head>,
            val news: List<Any>, val serial: List<Serial>,
            val subTags: List<SubTag>, val userStages: List<UserStage>,
            val video: List<Video>, val zhuanlan: List<Zhuanlan>) {

        data class ExtraHome1(val api_version: String, val recommend: String, val userTag: String)

        data class Serial(
                val categoryName: String, val courseCount: Int,
                val hideNum: Boolean, val id: String,
                val maxPrice: String, val minPrice: String,
                val saleNum: Int, val serialType: String,
                val tagId: Int, val teacherList: List<Teacher>,
                val title: String, val type: String) {

            data class Teacher(val id: Int, val imgUrl: String, val name: String)
        }

        data class Video(val articleUrl: String,
                         val courseId: Int, val endTime: Long,
                         val id: String, val img: String,
                         val opId: Int, val purchased: Boolean,
                         val rank: Int, val tagId: Int,
                         val title: String, val type: String,
                         val url: String, val urlId: String,
                         val urlType: String, val validTime: Long,
                         val videoUrl: String, val viewed: Int)

        data class SubTag(val redirect: Boolean, val tagId: String, val tagName: String)

        data class UserStage(val redirect: Boolean, val tagId: String, val tagName: String)

        data class Head(
                val endTime: Long, val id: String, val img: String, val tagId: Int,
                val tagName: String, val title: String,
                val type: String, val url: String, val validTime: Long)

        data class Course(
                val categoryName: String, val courseOriginalPrice: Double,
                val courseSaleNum: Int, val courseSalePrice: Double, val courseSaleTime: Long,
                val courseStartTime: Long, val courseTime: String, val courseTitle: String,
                val expireDate: String, val hideNum: Boolean, val id: Int,
                val iosSalePrice: Double, val lessonNum: Double, val lessonTime: Long,
                val limitNum: Int, val liveStatus: Boolean, val promotionId: Int,
                val promotionType: Int, val purchased: Boolean, val rank: Int,
                val registrationDeadline: Long, val saleEndTime: Long, val saleStartTime: Long,
                val status: Int, val teacherList: List<Teacher>, val url: String) {

            data class Teacher(val id: String, val imgUrl: String, val name: String)
        }

        data class Zhuanlan(
                val courseId: Int, val courseSaleStartTime: Long, val endTime: Long, val haveDetail: Int,
                val id: String, val img: String, val introduction: String,
                val lessonId: String, val purchased: Boolean, val remindStatus: Int,
                val status: Int, val tagId: Int, val teacher: Teacher,
                val teacherName: String, val teacherTag: String, val title: String,
                val type: String, val url: String, val validTime: Long) {

            data class Teacher(val id: Int, val img: String, val tagType: String, val title: String)
        }
    }
}
