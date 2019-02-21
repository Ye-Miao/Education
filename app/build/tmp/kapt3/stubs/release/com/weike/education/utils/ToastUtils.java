package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/20
 * * desc: Toast工具类
 */
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/weike/education/utils/ToastUtils;", "", "()V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "mToast", "Landroid/widget/Toast;", "getCenterSingleToast", "resId", "", "duration", "text", "", "getCenterToast", "getSingleToast", "getToast", "showCenterLongToast", "", "showCenterSingleLongToast", "showCenterSingleToast", "showCenterToast", "showLongToast", "showSingleLongToast", "showSingleToast", "showToast", "app_release"})
public final class ToastUtils {
    private static android.widget.Toast mToast;
    private static final android.content.Context context = null;
    public static final com.weike.education.utils.ToastUtils INSTANCE = null;
    
    /**
     * ********************
     *     * 非连续弹出的Toast
     */
    public final void showSingleToast(int resId) {
    }
    
    public final void showSingleToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showSingleLongToast(int resId) {
    }
    
    public final void showSingleLongToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * *********************
     *     * 连续弹出的Toast 位置在中央
     */
    public final void showCenterToast(int resId) {
    }
    
    public final void showCenterToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showCenterLongToast(int resId) {
    }
    
    public final void showCenterLongToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * ********************
     *     * 非连续弹出的Toast 位置在中央
     */
    public final void showCenterSingleToast(int resId) {
    }
    
    public final void showCenterSingleToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showCenterSingleLongToast(int resId) {
    }
    
    public final void showCenterSingleLongToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * *********************
     *     * 连续弹出的Toast
     */
    public final void showToast(int resId) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void showLongToast(int resId) {
    }
    
    public final void showLongToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getSingleToast(int resId, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getSingleToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getToast(int resId, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getCenterSingleToast(int resId, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getCenterSingleToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getCenterToast(int resId, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast getCenterToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
        return null;
    }
    
    private ToastUtils() {
        super();
    }
}