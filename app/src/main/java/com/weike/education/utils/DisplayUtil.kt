package com.weike.education.utils

import android.util.TypedValue

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/26
 * desc: dp、sp 转换为 px 的工具类
 *
 */
object DisplayUtil {

    /**
     * 将px值转换为dip或dp值，保证尺寸大小不变
     */
    fun px2dip(pxValue: Float): Int =
            (pxValue / AppUtils.getScreenScale() + 0.5f).toInt()

    /**
     * 将dip或dp值转换成px值，保证尺寸大小不变
     */
    fun dip2px(dipValue: Float): Int =
            (dipValue * AppUtils.getScreenScale() + 0.5f).toInt()

    /**
     * 将px值转换成sp值，保证文字大小不变
     */
    fun px2sp(pxValue: Float): Int =
            (pxValue / AppUtils.getScreenScaleDensity() + 0.5f).toInt()

    /**
     * 将sp值转换成px值，保证文字大小不变
     */
    fun sp2px(spValue: Float): Int =
            (spValue * AppUtils.getScreenScaleDensity() + 0.5f).toInt()

    fun sp2px(size: Int): Float =
            TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, size.toFloat(), AppUtils.getDisplayMetrics())
}