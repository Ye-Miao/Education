package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/7
 * * desc:
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001J$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001J&\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 J,\u0010!\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\"\u001a\u00020\u0010H\u0002J \u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001J$\u0010&\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001J$\u0010\'\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/weike/education/utils/LogUtils;", "", "()V", "FILE_SUFFIX", "Ljava/text/SimpleDateFormat;", "LOG_FILE_NAME", "", "LOG_FILE_PATH", "LOG_FORMAT", "LOG_SAVE_DAYS", "", "LOG_SWITCH", "", "LOG_TAG", "LOG_TO_FILE", "LOG_TYPE", "", "dateBefore", "Ljava/util/Date;", "getDateBefore", "()Ljava/util/Date;", "d", "", "msg", "tag", "tr", "", "delFile", "e", "i", "init", "context", "Landroid/content/Context;", "log", "level", "log2File", "mylogtype", "text", "v", "w", "app_debug"})
public final class LogUtils {
    private static final boolean LOG_SWITCH = true;
    private static final boolean LOG_TO_FILE = false;
    private static final java.lang.String LOG_TAG = "TAG";
    private static final char LOG_TYPE = 'v';
    private static final int LOG_SAVE_DAYS = 7;
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private static final java.text.SimpleDateFormat LOG_FORMAT = null;
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private static final java.text.SimpleDateFormat FILE_SUFFIX = null;
    private static java.lang.String LOG_FILE_PATH;
    private static java.lang.String LOG_FILE_NAME;
    public static final com.weike.education.utils.LogUtils INSTANCE = null;
    
    private final java.util.Date getDateBefore() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * **************************
     *     * Warn
     */
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable tr) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    /**
     * *************************
     *     * Error
     */
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable tr) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    /**
     * *************************
     *     * Debug
     */
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable tr) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    /**
     * **************************
     *     * Info
     */
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable tr) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Object msg) {
    }
    
    /**
     * ************************
     *     * Verbose
     */
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable tr) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    /**
     * * 根据tag, msg和等级，输出日志
     *     *
     *     * @param tag
     *     * @param msg
     *     * @param level
     */
    private final void log(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr, char level) {
    }
    
    /**
     * * 打开日志文件并写入日志
     *     *
     *     * @return
     */
    private final synchronized void log2File(java.lang.String mylogtype, java.lang.String tag, java.lang.String text) {
    }
    
    /**
     * * 删除指定的日志文件
     */
    public final void delFile() {
    }
    
    private LogUtils() {
        super();
    }
}