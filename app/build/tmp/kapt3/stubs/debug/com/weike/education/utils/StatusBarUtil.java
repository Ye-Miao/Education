package com.weike.education.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ$\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004H\u0007J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007J$\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004H\u0007J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0004J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\"\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0014J\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\"\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0014J\u000e\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\u000e\u0010.\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/weike/education/utils/StatusBarUtil;", "", "()V", "DEFAULT_STATUS_BAR_ALPHA", "", "getDEFAULT_STATUS_BAR_ALPHA", "()I", "FAKE_STATUS_BAR_VIEW_ID", "FAKE_TRANSLUCENT_VIEW_ID", "TAG_KEY_HAVE_SET_OFFSET", "addTranslucentView", "", "activity", "Landroid/app/Activity;", "statusBarAlpha", "calculateStatusColor", "color", "alpha", "clearPreviousSetting", "createStatusBarView", "Landroid/view/View;", "createTranslucentStatusBarView", "getStatusBarHeight", "context", "Landroid/content/Context;", "hideFakeStatusBarView", "setColor", "setColorDiff", "setColorForSwipeBack", "setColorNoTranslucent", "setDarkMode", "setLightMode", "setMIUIStatusBarDarkIcon", "darkIcon", "", "setMeizuStatusBarDarkIcon", "setRootView", "setTranslucent", "setTranslucentDiff", "setTranslucentForCoordinatorLayout", "setTranslucentForImageView", "needOffsetView", "setTranslucentForImageViewInFragment", "setTransparent", "setTransparentForImageView", "setTransparentForImageViewInFragment", "setTransparentForWindow", "transparentStatusBar", "app_debug"})
public final class StatusBarUtil {
    private static final int DEFAULT_STATUS_BAR_ALPHA = 112;
    private static final int FAKE_STATUS_BAR_VIEW_ID = 2131296528;
    private static final int FAKE_TRANSLUCENT_VIEW_ID = 2131296529;
    private static final int TAG_KEY_HAVE_SET_OFFSET = -123;
    public static final com.weike.education.utils.StatusBarUtil INSTANCE = null;
    
    public final int getDEFAULT_STATUS_BAR_ALPHA() {
        return 0;
    }
    
    /**
     * * 设置状态栏颜色
     *     *
     *     * @param activity       需要设置的activity
     *     * @param color          状态栏颜色值
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha) {
    }
    
    /**
     * * 设置状态栏颜色
     *     *
     *     * @param activity       需要设置的activity
     *     * @param color          状态栏颜色值
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color) {
    }
    
    /**
     * * 为滑动返回界面设置状态栏颜色
     *     *
     *     * @param activity       需要设置的activity
     *     * @param color          状态栏颜色值
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setColorForSwipeBack(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha) {
    }
    
    /**
     * * 为滑动返回界面设置状态栏颜色
     *     *
     *     * @param activity       需要设置的activity
     *     * @param color          状态栏颜色值
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setColorForSwipeBack(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color) {
    }
    
    /**
     * * 设置状态栏纯色 不加半透明效果
     *     *
     *     * @param activity 需要设置的 activity
     *     * @param color    状态栏颜色值
     */
    public final void setColorNoTranslucent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color) {
    }
    
    /**
     * * 设置状态栏颜色(5.0以下无半透明效果,不建议使用)
     *     *
     *     * @param activity 需要设置的 activity
     *     * @param color    状态栏颜色值
     */
    public final void setColorDiff(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.ColorInt()
    int color) {
    }
    
    /**
     * * 使状态栏半透明
     *     *
     *     *
     *     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *     *
     *     * @param activity       需要设置的activity
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setTranslucent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha) {
    }
    
    /**
     * * 使状态栏半透明
     *     *
     *     *
     *     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *     *
     *     * @param activity       需要设置的activity
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setTranslucent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 针对根布局是 CoordinatorLayout, 使状态栏半透明
     *     *
     *     *
     *     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *     *
     *     * @param activity       需要设置的activity
     *     * @param statusBarAlpha 状态栏透明度
     */
    public final void setTranslucentForCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha) {
    }
    
    /**
     * * 设置状态栏全透明
     *     *
     *     * @param activity 需要设置的activity
     */
    public final void setTransparent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 使状态栏透明(5.0以上半透明效果,不建议使用)
     *     *
     *     *
     *     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *     *
     *     * @param activity 需要设置的activity
     */
    public final void setTranslucentDiff(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 为头部是 ImageView 的界面设置状态栏全透明
     *     *
     *     * @param activity       需要设置的activity
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTransparentForImageView(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 为头部是 ImageView 的界面设置状态栏透明(使用默认透明度)
     *     *
     *     * @param activity       需要设置的activity
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTranslucentForImageView(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 为头部是 ImageView 的界面设置状态栏透明
     *     *
     *     * @param activity       需要设置的activity
     *     * @param statusBarAlpha 状态栏透明度
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTranslucentForImageView(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 为 fragment 头部是 ImageView 的设置状态栏透明
     *     *
     *     * @param activity       fragment 对应的 activity
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTranslucentForImageViewInFragment(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 为 fragment 头部是 ImageView 的设置状态栏透明
     *     *
     *     * @param activity       fragment 对应的 activity
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTransparentForImageViewInFragment(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 为 fragment 头部是 ImageView 的设置状态栏透明
     *     *
     *     * @param activity       fragment 对应的 activity
     *     * @param statusBarAlpha 状态栏透明度
     *     * @param needOffsetView 需要向下偏移的 View
     */
    public final void setTranslucentForImageViewInFragment(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha, @org.jetbrains.annotations.Nullable()
    android.view.View needOffsetView) {
    }
    
    /**
     * * 隐藏伪状态栏 View
     *     *
     *     * @param activity 调用的 Activity
     */
    public final void hideFakeStatusBarView(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 亮光模式
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void setLightMode(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 暗淡模式
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void setDarkMode(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 修改 MIUI V6  以上状态栏颜色
     */
    private final void setMIUIStatusBarDarkIcon(android.app.Activity activity, boolean darkIcon) {
    }
    
    /**
     * * 修改魅族状态栏字体颜色 Flyme 4.0
     */
    private final void setMeizuStatusBarDarkIcon(android.app.Activity activity, boolean darkIcon) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void clearPreviousSetting(android.app.Activity activity) {
    }
    
    /**
     * * 添加半透明矩形条
     *     *
     *     * @param activity       需要设置的 activity
     *     * @param statusBarAlpha 透明值
     */
    private final void addTranslucentView(android.app.Activity activity, @android.support.annotation.IntRange(from = 0L, to = 255L)
    int statusBarAlpha) {
    }
    
    /**
     * * 生成一个和状态栏大小相同的半透明矩形条
     *     *
     *     * @param activity 需要设置的activity
     *     * @param color    状态栏颜色值
     *     * @param alpha    透明值
     *     * @return 状态栏矩形条
     */
    private final android.view.View createStatusBarView(android.app.Activity activity, @android.support.annotation.ColorInt()
    int color, int alpha) {
        return null;
    }
    
    /**
     * * 设置根布局参数
     */
    private final void setRootView(android.app.Activity activity) {
    }
    
    /**
     * * 设置透明
     */
    public final void setTransparentForWindow(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * 使状态栏透明
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void transparentStatusBar(android.app.Activity activity) {
    }
    
    /**
     * * 创建半透明矩形 View
     *     *
     *     * @param alpha 透明值
     *     * @return 半透明 View
     */
    private final android.view.View createTranslucentStatusBarView(android.app.Activity activity, int alpha) {
        return null;
    }
    
    /**
     * * 获取状态栏高度
     *     *
     *     * @param context context
     *     * @return 状态栏高度
     */
    public final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * * 计算状态栏颜色
     *     *
     *     * @param color color值
     *     * @param alpha alpha值
     *     * @return 最终的状态栏颜色
     */
    private final int calculateStatusColor(@android.support.annotation.ColorInt()
    int color, int alpha) {
        return 0;
    }
    
    private StatusBarUtil() {
        super();
    }
}