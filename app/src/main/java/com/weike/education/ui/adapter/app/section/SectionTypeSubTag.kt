package com.weike.education.ui.adapter.app.section

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import com.weike.education.R
import com.weike.education.mvp.model.app.VerticalBean
import com.weike.education.ui.adapter.app.SectionTypeSubTagAdapter
import com.weike.education.widget.section.StatelessSection
import com.weike.education.widget.section.ViewHolder

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签顶部Tab-section
 *
 */
class SectionTypeSubTag(private val list: List<VerticalBean.Data.SubTag>?) : StatelessSection<Nothing>(R.layout.layout_item_section_type_subtag, R.layout.layout_empty) {

    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        holder.let {
            val recyclerView = it.getView<RecyclerView>(R.id.recycler)
            recyclerView.setHasFixedSize(true)
            val mLayoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
            recyclerView.layoutManager = mLayoutManager
            recyclerView.adapter = SectionTypeSubTagAdapter(list)
        }
    }
}