package com.weike.education.ui.adapter.app.section

import com.weike.education.R
import com.weike.education.mvp.model.app.SelectionBean
import com.weike.education.widget.BannerViewHolder
import com.weike.education.widget.section.StatelessSection
import com.weike.education.widget.section.ViewHolder
import com.zhouwei.mzbanner.MZBannerView

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/20
 * desc: 首页精选轮播section
 *
 */
class SectionBanner(private val list: List<SelectionBean.Data.Head>?) : StatelessSection<Nothing>(R.layout.layout_banner, R.layout.layout_empty) {

    override fun onBindHeaderViewHolder(holder: ViewHolder) {
        val urls = list?.map { it.img }
        val mMZBanner = holder.itemView.findViewById(R.id.banner) as MZBannerView<String>
        // 设置数据
        mMZBanner.setPages(urls) {
            BannerViewHolder()
        }
        mMZBanner.start()
    }
}