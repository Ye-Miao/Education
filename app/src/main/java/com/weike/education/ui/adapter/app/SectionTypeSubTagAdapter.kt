package com.weike.education.ui.adapter.app

import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.weike.education.R
import com.weike.education.mvp.model.app.VerticalBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/29
 * desc: 标签顶部tab
 *
 */
class SectionTypeSubTagAdapter(list: List<VerticalBean.Data.SubTag>?) : BaseQuickAdapter<VerticalBean.Data.SubTag, BaseViewHolder>(R.layout.item_section_type_subtag, list) {
    override fun convert(helper: BaseViewHolder, item: VerticalBean.Data.SubTag) {
        with(helper) {
            item.let {
                setText(R.id.tv_title, it.name)
                Glide.with(mContext)
                        .load(it.icon)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(helper.getView(R.id.iv_icon))
            }
        }
    }
}