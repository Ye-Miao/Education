package com.weike.education.ui.adapter.app

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.weike.education.R
import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.utils.AppUtils.getColor
import kotlinx.android.synthetic.main.choose_left_item.view.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: 选择阶段-left列表
 *
 */
class ChoosePhaseAdapter(layoutId: Int, mData: List<DiscoveryCommentBean.Data.Stages.SubTag>?) : BaseQuickAdapter<DiscoveryCommentBean.Data.Stages.SubTag, BaseViewHolder>(layoutId, mData) {
    var selectedPosition: Int = -1

    override fun convert(helper: BaseViewHolder, item: DiscoveryCommentBean.Data.Stages.SubTag) {
        with(helper) {
            setText(R.id.left_text, item.tagName)

            if (adapterPosition == selectedPosition) {
                itemView.left_text.setTextColor(getColor(R.color.tab_textSelectColor))
                itemView.setBackgroundColor(getColor(R.color.choose_left_bg))
            } else {
                // 默认 不设置颜色
                itemView.left_text.setTextColor(getColor(R.color.tab_textUnSelectColor))
                // 默认背景
                itemView.setBackgroundColor(getColor(R.color.choose_left_bg_UnSelect))
            }
        }
    }
}