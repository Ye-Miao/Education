package com.weike.education.widget;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/27
 * * desc: 圆形头像
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 @2\u00020\u0001:\u0001@B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0014J(\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0014J\u000e\u00106\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020\u0014H\u0016J\u0012\u00109\u001a\u00020.2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020\u0007H\u0016J\u0010\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020,H\u0016J\b\u0010>\u001a\u00020.H\u0002J\b\u0010?\u001a\u00020.H\u0002R$\u0010\t\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/weike/education/widget/CircleImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderColor", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderWidth", "getBorderWidth", "setBorderWidth", "isDisplayCircle", "", "mBitmap", "Landroid/graphics/Bitmap;", "mBitmapHeight", "mBitmapPaint", "Landroid/graphics/Paint;", "mBitmapShader", "Landroid/graphics/BitmapShader;", "mBitmapWidth", "mBorderColor", "mBorderPaint", "mBorderRadius", "", "mBorderRect", "Landroid/graphics/RectF;", "mBorderWidth", "mDrawableRadius", "mDrawableRect", "mReady", "mSetupPending", "mShaderMatrix", "Landroid/graphics/Matrix;", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "getScaleType", "Landroid/widget/ImageView$ScaleType;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "setDisplayCircle", "setImageBitmap", "bm", "setImageDrawable", "setImageResource", "resId", "setScaleType", "scaleType", "setup", "updateShaderMatrix", "Companion", "app_debug"})
public final class CircleImageView extends android.widget.ImageView {
    private final android.graphics.RectF mDrawableRect = null;
    private final android.graphics.RectF mBorderRect = null;
    private final android.graphics.Matrix mShaderMatrix = null;
    private final android.graphics.Paint mBitmapPaint = null;
    private final android.graphics.Paint mBorderPaint = null;
    private int mBorderColor;
    private int mBorderWidth;
    private android.graphics.Bitmap mBitmap;
    private android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBitmapHeight;
    private float mDrawableRadius;
    private float mBorderRadius;
    private final boolean mReady = false;
    private boolean mSetupPending;
    private boolean isDisplayCircle;
    private static final android.widget.ImageView.ScaleType SCALE_TYPE = null;
    private static final android.graphics.Bitmap.Config BITMAP_CONFIG = null;
    private static final int COLORDRAWABLE_DIMENSION = 1;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final com.weike.education.widget.CircleImageView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getBorderColor() {
        return 0;
    }
    
    public final void setBorderColor(int borderColor) {
    }
    
    public final int getBorderWidth() {
        return 0;
    }
    
    public final void setBorderWidth(int borderWidth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ImageView.ScaleType getScaleType() {
        return null;
    }
    
    @java.lang.Override()
    public void setScaleType(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView.ScaleType scaleType) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    public final void setDisplayCircle(boolean isDisplayCircle) {
    }
    
    @java.lang.Override()
    public void setImageBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bm) {
    }
    
    @java.lang.Override()
    public void setImageDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override()
    public void setImageResource(int resId) {
    }
    
    private final android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    private final void setup() {
    }
    
    private final void updateShaderMatrix() {
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/weike/education/widget/CircleImageView$Companion;", "", "()V", "BITMAP_CONFIG", "Landroid/graphics/Bitmap$Config;", "COLORDRAWABLE_DIMENSION", "", "DEFAULT_BORDER_COLOR", "DEFAULT_BORDER_WIDTH", "SCALE_TYPE", "Landroid/widget/ImageView$ScaleType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}