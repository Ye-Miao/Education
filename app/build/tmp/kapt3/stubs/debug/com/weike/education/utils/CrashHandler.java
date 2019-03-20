package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/28
 * * desc: 全局异常捕获，当程序发生Uncaught异常时,由该类记录处理上传
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/weike/education/utils/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "mContext", "Landroid/content/Context;", "mExceptionHandler", "handleException", "", "ex", "", "init", "", "context", "uncaughtException", "t", "Ljava/lang/Thread;", "e", "Companion", "app_debug"})
public final class CrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    
    /**
     * * 系统默认的UncaughtExceptionHandler,用来捕获并处理在一个线程对象中抛出的未检测异常，以避免程序终止
     */
    private java.lang.Thread.UncaughtExceptionHandler mExceptionHandler;
    private android.content.Context mContext;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static volatile com.weike.education.utils.CrashHandler INSTANCE;
    public static final com.weike.education.utils.CrashHandler.Companion Companion = null;
    
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/weike/education/utils/CrashHandler$Companion;", "", "()V", "INSTANCE", "Lcom/weike/education/utils/CrashHandler;", "instance", "getInstance", "()Lcom/weike/education/utils/CrashHandler;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.weike.education.utils.CrashHandler getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}