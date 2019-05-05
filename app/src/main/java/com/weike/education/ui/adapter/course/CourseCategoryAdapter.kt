package com.weike.education.ui.adapter.course

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.weike.education.R
import com.weike.education.mvp.model.course.VideoBean
import com.weike.education.ui.activity.course.VideoPlayerActivity

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/4
 * desc:
 *
 */
class CourseCategoryAdapter(data: List<VideoBean.Data.Video>) : BaseQuickAdapter<VideoBean.Data.Video, BaseViewHolder>(R.layout.layout_course_video, data) {
    override fun convert(helper: BaseViewHolder, item: VideoBean.Data.Video) {
        with(helper) {
            item.let {
                setText(R.id.tv_title, item.title)
                Glide.with(mContext)
                        .load(item.img)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .dontAnimate()
                        .into(getView(R.id.iv_preview))
                itemView.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putString("Url", item.videoUrl)
                    bundle.putString("title", item.title)
                    mContext.startActivity(Intent(mContext, VideoPlayerActivity::class.java).putExtra("bundle", bundle))
                }
            }
        }
    }
}