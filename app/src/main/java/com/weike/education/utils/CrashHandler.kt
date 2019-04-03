package com.weike.education.utils

import android.annotation.SuppressLint
import android.content.Context

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/28
 * desc: 全局异常捕获，当程序发生Uncaught异常时,由该类记录处理上传
 */

@SuppressLint("StaticFieldLeak")
object CrashHandler : Thread.UncaughtExceptionHandler {

    /**
     * 系统默认的UncaughtExceptionHandler,用来捕获并处理在一个线程对象中抛出的未检测异常，以避免程序终止
     */
    private var mExceptionHandler: Thread.UncaughtExceptionHandler? = null
    private var mContext: Context? = null

    fun init(context: Context) {
        mContext = context
        // 获取系统默认的UncaughtException处理器
        mExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()
        // 设置该CrashHandler为程序的默认处理器
        Thread.setDefaultUncaughtExceptionHandler(this)
    }

    /**
     * 当UncaughtException发生时转入该函数处理
     */
    override fun uncaughtException(t: Thread, e: Throwable) {
        if (!handleException(e) && mExceptionHandler != null) {
            // 如果用户没有处理则让系统默认的异常处理器来处理
            mExceptionHandler?.uncaughtException(t, e)
        } else {
            // 异常发生后的自定义操作
            LogUtils.e("myError", e)
        }
    }

    private fun handleException(ex: Throwable?): Boolean {
        return if (ex == null) false else true
        // 收集异常信息上传bugly
    }
}
