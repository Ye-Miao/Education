package com.weike.education.utils

import android.annotation.SuppressLint
import android.view.Gravity
import android.widget.Toast

@SuppressLint("StaticFieldLeak")
/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/20
 * desc: Toast工具类
 */
object ToastUtils {
    private var mToast: Toast? = null
    private val context = AppUtils.getAppContext()

    /**********************
     * 非连续弹出的Toast
     */
    fun showSingleToast(resId: Int) { // R.string.**
        getSingleToast(resId, Toast.LENGTH_SHORT).show()
    }

    fun showSingleToast(text: String) {
        getSingleToast(text, Toast.LENGTH_SHORT).show()
    }

    fun showSingleLongToast(resId: Int) {
        getSingleToast(resId, Toast.LENGTH_LONG).show()
    }

    fun showSingleLongToast(text: String) {
        getSingleToast(text, Toast.LENGTH_LONG).show()
    }

    /***********************
     * 连续弹出的Toast 位置在中央
     */
    fun showCenterToast(resId: Int) {
        getCenterToast(resId, Toast.LENGTH_SHORT).show()
    }

    fun showCenterToast(text: String) {
        getCenterToast(text, Toast.LENGTH_SHORT).show()
    }

    fun showCenterLongToast(resId: Int) {
        getCenterToast(resId, Toast.LENGTH_LONG).show()
    }

    fun showCenterLongToast(text: String) {
        getCenterToast(text, Toast.LENGTH_LONG).show()
    }

    /**********************
     * 非连续弹出的Toast 位置在中央
     */
    fun showCenterSingleToast(resId: Int) { // R.string.**
        getCenterSingleToast(resId, Toast.LENGTH_SHORT).show()
    }

    fun showCenterSingleToast(text: String) {
        getCenterSingleToast(text, Toast.LENGTH_SHORT).show()
    }

    fun showCenterSingleLongToast(resId: Int) {
        getCenterSingleToast(resId, Toast.LENGTH_LONG).show()
    }

    fun showCenterSingleLongToast(text: String) {
        getCenterSingleToast(text, Toast.LENGTH_LONG).show()
    }

    /***********************
     * 连续弹出的Toast
     */
    fun showToast(resId: Int) {
        getToast(resId, Toast.LENGTH_SHORT).show()
    }

    fun showToast(text: String) {
        getToast(text, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(resId: Int) {
        getToast(resId, Toast.LENGTH_LONG).show()
    }

    fun showLongToast(text: String) {
        getToast(text, Toast.LENGTH_LONG).show()
    }

    fun getSingleToast(resId: Int, duration: Int): Toast { // 连续调用不会连续弹出，只是替换文本
        return getSingleToast(context!!.resources.getText(resId).toString(), duration)
    }

    fun getSingleToast(text: String, duration: Int): Toast {
        if (mToast == null) {
            mToast = Toast.makeText(context, text, duration)
        } else {
            mToast!!.setText(text)
        }
        return mToast!!
    }

    fun getToast(resId: Int, duration: Int): Toast { // 连续调用会连续弹出
        return getToast(context!!.resources.getText(resId).toString(), duration)
    }

    fun getToast(text: String, duration: Int): Toast {
        return Toast.makeText(context, text, duration)
    }

    fun getCenterSingleToast(resId: Int, duration: Int): Toast { // 连续调用不会连续弹出，只是替换文本
        return getCenterSingleToast(context!!.resources.getText(resId).toString(), duration)
    }

    fun getCenterSingleToast(text: String, duration: Int): Toast {
        if (mToast == null) {
            mToast = Toast.makeText(context, text, duration)
        } else {
            mToast!!.setText(text)
        }
        mToast!!.setGravity(Gravity.CENTER, 0, 0)
        return mToast!!
    }

    fun getCenterToast(resId: Int, duration: Int): Toast { // 连续调用会连续弹出
        return getCenterToast(context!!.resources.getText(resId).toString(), duration)
    }

    fun getCenterToast(text: String, duration: Int): Toast {
        mToast = Toast.makeText(context, text, duration)
        mToast!!.setGravity(Gravity.CENTER, 0, 0)
        return mToast!!
    }
}
