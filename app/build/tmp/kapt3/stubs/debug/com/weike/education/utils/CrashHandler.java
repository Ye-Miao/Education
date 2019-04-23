package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/28
 * * desc: 全局异常捕获，当程序发生Uncaught异常时,由该类记录处理上传
 */
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/weike/education/utils/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "mContext", "Landroid/content/Context;", "mExceptionHandler", "handleException", "", "ex", "", "init", "", "context", "uncaughtException", "t", "Ljava/lang/Thread;", "e", "app_debug"})
public final class CrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    
    /**
     * * 系统默认的UncaughtExceptionHandler,用来捕获并处理在一个线程对象中抛出的未检测异常，以避免程序终止
     */
    private static java.lang.Thread.UncaughtExceptionHandler mExceptionHandler;
    private static android.content.Context mContext;
    public static final com.weike.education.utils.CrashHandler INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * 当UncaughtException发生时转入该函数处理
     */
    @java.lang.Override()
    public void uncaughtException(@org.jetbrains.annotations.NotNull()
    java.lang.Thread t, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    private final boolean handleException(java.lang.Throwable ex) {
        return false;
    }
    
    private CrashHandler() {
        super();
    }
}