package com.weike.education.adapter.app

import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.weike.education.R
import com.weike.education.bean.app.VerticalBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc:
 *
 */
class SectionTypeColumnAdapter(data: List<VerticalBean.Data.Column.CourseCard.Teacher>?) : BaseQuickAdapter<VerticalBean.Data.Column.CourseCard.Teacher, BaseViewHolder>(R.layout.section_serial_head_portrait, data) {
    override fun convert(helper: BaseViewHolder, item: VerticalBean.Data.Column.CourseCard.Teacher) {
        helper.apply {
            item.let {
                setText(R.id.name, it.name)
                Glide.with(mContext)
                        .load(it.imgUrl)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(helper.getView(R.id.image))
            }
        }
    }
}