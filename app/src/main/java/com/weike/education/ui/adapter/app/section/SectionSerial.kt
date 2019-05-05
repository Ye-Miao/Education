package com.weike.education.ui.adapter.app.section

import android.view.View
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.weike.education.R
import com.weike.education.mvp.model.app.SelectionBean
import com.weike.education.utils.EmptyUtils
import com.weike.education.widget.CircleImageView
import com.weike.education.widget.section.StatelessSection
import com.weike.education.widget.section.ViewHolder

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/27
 * desc: 首页-系列好课-section
 *
 */
class SectionSerial(list: List<SelectionBean.Data.Serial>?) : StatelessSection<SelectionBean.Data.Serial>(R.layout.layout_item_section_head, R.layout.layout_item_serial_body, list) {

    override fun convert(holder: ViewHolder, mBean: SelectionBean.Data.Serial, position: Int) {
        with(holder) {
            mBean.let {
                if (position != 0) getView<View>(R.id.item).setBackgroundResource(R.drawable.ic_bottom_lines)

                setText(R.id.categoryName, it.categoryName)
                setText(R.id.title, it.title)
                setText(R.id.courseSaleTime_Num, "${it.serialType}/共${it.courseCount}门课")
                setText(R.id.saleNum, if (it.saleNum == 0) "" else "已有${it.saleNum}人购买")

                if (it.maxPrice == "0" && it.minPrice == "0")
                    setText(R.id.price, "免费").setVisible(R.id.yuan, false)
                else
                    setText(R.id.price, "${it.minPrice}-${it.maxPrice}")


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

    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        holder.setText(R.id.headTitle, R.string.head_serial).setVisible(R.id.headMore, false)
        holder.itemView.setBackgroundResource(R.drawable.section_serial_gradient)
    }
}