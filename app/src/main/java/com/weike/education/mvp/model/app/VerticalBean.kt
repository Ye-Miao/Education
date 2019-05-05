package com.weike.education.mvp.model.app

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/19
 * desc: 相应Tag页面的内容
 *
 */
data class VerticalBean(val code: String, val `data`: Data, val msg: String) {

    data class Data(
            val banner: List<Banner>,
            val column: List<Column>, val id: Int, val img: String,
            val name: String, val serial: List<Any>, val status: Int,
            val subTag: List<SubTag>, val subject: String, val tagType: String) {

        data class Banner(
                val courseId: Int, val endTime: Long,
                val id: String, val img: String, val purchased: Boolean,
                val tagId: Int, val time: Long, val title: String,
                val type: String, val url: String, val validTime: Long)

        data class Column(val courseCards: List<CourseCard>, val id: Int, val img: String, val title: String) {

            data class CourseCard(
                    val categoryName: String, val courseOriginalPrice: Double, val courseSaleNum: Int,
                    val courseSalePrice: Double, val courseSaleTime: Long, val courseStartTime: Long,
                    val courseTime: String, val courseTitle: String, val expireDate: String,
                    val hideNum: Boolean, val id: Int, val iosSalePrice: Double,
                    val lessonNum: Double, val lessonTime: Long, val limitNum: Int,
                    val liveStatus: Boolean, val promotionId: Int, val promotionType: Int,
                    val purchased: Boolean, val rank: Int, val registrationDeadline: Long,
                    val status: Int, val teacherList: List<Teacher>, val url: String) {

                data class Teacher(val id: String, val imgUrl: String, val name: String)
            }
        }

        data class SubTag(
                val background: String, val editor: String, val examType: String,
                val follow: Boolean, val icon: String, val id: Int,
                val name: String, val pid: Int, val rank: Int,
                val redirect: Boolean, val showSerialCourseNum: Int, val tagType: String,
                val teacherResume: String, val teacherStudentNum: String, val updateTime: Int)
    }
}
