package com.weike.education.ui.adapter.app.section

import android.support.constraint.ConstraintLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.weike.education.R
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.utils.EmptyUtils
import com.weike.education.widget.CircleImageView
import com.weike.education.widget.section.StatelessSection
import com.weike.education.widget.section.ViewHolder

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签item-section
 *
 */
class SectionTypeColumn(private val title: String, list: List<VerticalBean.Data.Column.CourseCard>?) : StatelessSection<VerticalBean.Data.Column.CourseCard>(R.layout.layout_item_section_type_head, R.layout.layout_item_course_body, list) {

    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        holder.setText(R.id.vertical_text, "一一 $title 一一")
    }

    override fun convert(holder: ViewHolder, mBean: VerticalBean.Data.Column.CourseCard, position: Int) {
        with(holder) {
            mBean.let {
                if (position != 0) getView<ConstraintLayout>(R.id.item).setBackgroundResource(R.drawable.ic_bottom_lines)

                setText(R.id.categoryName, it.categoryName)
                setText(R.id.title, it.courseTitle)
                setText(R.id.courseSaleTime_Num, "开课时间：${it.courseTime} ${it.lessonNum.toInt()}课时")

                if (it.courseSalePrice.toInt() == 0) {
                    setText(R.id.price, "免费")
                    setVisible(R.id.yuan, false)
                } else {
                    setText(R.id.price, "${it.courseSalePrice}")
                }

                if (it.courseSaleNum != 0) setText(R.id.saleNum, "已有${it.courseSaleNum}人购买")

                val ids = intArrayOf(R.id.iv_avatar1, R.id.iv_avatar2, R.id.iv_avatar3)
                val idsName = intArrayOf(R.id.name, R.id.name2, R.id.name3)
                if (EmptyUtils.isNotEmpty(it.teacherList)) {
                    it.teacherList.forEachIndexed { index, teacher ->
                        if (index > 2) return
                        Glide.with(mContext)
                                .load(teacher.imgUrl)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .dontAnimate()
                                .into(getView<CircleImageView>(ids[index]))
                        getView<TextView>(idsName[index]).text = teacher.name
                    }
                }
            }
        }
    }
}