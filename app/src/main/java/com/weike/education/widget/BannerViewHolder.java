package com.weike.education.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.weike.education.R;
import com.zhouwei.mzbanner.holder.MZViewHolder;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/1
 * desc:
 */
public class BannerViewHolder implements MZViewHolder<String> {
    private ImageView mImageView;

    @Override
    public View createView(Context context) {
        // 返回页面布局
        View view = LayoutInflater.from(context).inflate(R.layout.layout_banner_item, null);
        mImageView = (ImageView) view.findViewById(R.id.banner_image);
        return view;
    }

    @Override
    public void onBind(Context context, int position, String data) {
        // 数据绑定
        Glide.with(context)
                .load(data)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .bitmapTransform(new RoundedCornersTransformation(context, 5, 0))
                .dontAnimate()
                .into(mImageView);
    }
}
