package com.weike.education.utils;

import java.lang.System;

/**
 * * 圆形加载框
 * * A Material style progress wheel, compatible up to 2.2.
 * * Todd Davies' Progress Wheel https://github.com/Todd-Davies/ProgressWheel
 * *
 * * @author Nico Hormazábal
 * * Licensed under the Apache License 2.0 license see:
 * * http://www.apache.org/licenses/LICENSE-2.0
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 e2\u00020\u0001:\u0003efgB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0006\u00102\u001a\u00020\tJ\u0006\u00103\u001a\u00020\tJ\u0006\u00104\u001a\u00020\tJ\u0006\u00105\u001a\u00020\tJ\u0006\u00106\u001a\u00020\tJ\u0006\u00107\u001a\u00020\u000bJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0014J\u0018\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0014J\u0010\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020AH\u0016J\n\u0010B\u001a\u0004\u0018\u00010AH\u0016J(\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0014J\u0018\u0010H\u001a\u0002092\u0006\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\tH\u0014J\u0010\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u000209J\b\u0010O\u001a\u000209H\u0002J\u0010\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u000bH\u0002J\b\u0010Q\u001a\u000209H\u0003J\u000e\u0010R\u001a\u0002092\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010S\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010T\u001a\u0002092\u0006\u0010U\u001a\u00020\u0016J\u000e\u0010V\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010W\u001a\u0002092\u0006\u0010\'\u001a\u00020\u000bJ\u000e\u0010X\u001a\u0002092\u0006\u0010Y\u001a\u00020\rJ\u000e\u0010Z\u001a\u0002092\u0006\u0010,\u001a\u00020\tJ\u000e\u0010[\u001a\u0002092\u0006\u0010.\u001a\u00020\tJ\u000e\u0010\\\u001a\u0002092\u0006\u00100\u001a\u00020\u000bJ\u0018\u0010]\u001a\u0002092\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\tH\u0002J\b\u0010`\u001a\u000209H\u0002J\u0006\u0010a\u001a\u000209J\u0006\u0010b\u001a\u000209J\u0010\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020!H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\'\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006h"}, d2 = {"Lcom/weike/education/utils/ProgressWheel;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "barColor", "", "barExtraLength", "", "barGrowingFromFront", "", "barLength", "barMaxLength", "barPaint", "Landroid/graphics/Paint;", "barSpinCycleTime", "", "barWidth", "callback", "Lcom/weike/education/utils/ProgressWheel$ProgressCallback;", "circleBounds", "Landroid/graphics/RectF;", "circleRadius", "fillRadius", "<set-?>", "isSpinning", "()Z", "setSpinning", "(Z)V", "lastTimeAnimated", "", "linearProgress", "mProgress", "mTargetProgress", "pauseGrowingTime", "pausedTimeWithoutGrowing", "progress", "getProgress", "()F", "setProgress", "(F)V", "rimColor", "rimPaint", "rimWidth", "shouldAnimate", "spinSpeed", "timeStartGrowing", "getBarColor", "getBarWidth", "getCircleRadius", "getRimColor", "getRimWidth", "getSpinSpeed", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSizeChanged", "w", "h", "oldw", "oldh", "onVisibilityChanged", "changedView", "visibility", "parseAttributes", "a", "Landroid/content/res/TypedArray;", "resetCount", "runCallback", "value", "setAnimationEnabled", "setBarColor", "setBarWidth", "setCallback", "progressCallback", "setCircleRadius", "setInstantProgress", "setLinearProgress", "isLinear", "setRimColor", "setRimWidth", "setSpinSpeed", "setupBounds", "layout_width", "layout_height", "setupPaints", "spin", "stopSpinning", "updateBarLength", "deltaTimeInMilliSeconds", "Companion", "ProgressCallback", "WheelSavedState", "app_debug"})
public final class ProgressWheel extends android.view.View {
    private final int barLength = 16;
    private final int barMaxLength = 270;
    private final long pauseGrowingTime = 200L;
    
    /**
     * * *********
     *     * DEFAULTS *
     *     * **********
     */
    private int circleRadius;
    private int barWidth;
    private int rimWidth;
    private boolean fillRadius;
    private double timeStartGrowing;
    private double barSpinCycleTime;
    private float barExtraLength;
    private boolean barGrowingFromFront;
    private long pausedTimeWithoutGrowing;
    private int barColor;
    private int rimColor;
    private final android.graphics.Paint barPaint = null;
    private final android.graphics.Paint rimPaint = null;
    private android.graphics.RectF circleBounds;
    private float spinSpeed;
    private long lastTimeAnimated;
    private boolean linearProgress;
    private float mProgress;
    private float mTargetProgress;
    
    /**
     * * Check if the wheel is currently spinning
     */
    private boolean isSpinning;
    private com.weike.education.utils.ProgressWheel.ProgressCallback callback;
    private boolean shouldAnimate;
    private static final java.lang.String TAG = null;
    public static final com.weike.education.utils.ProgressWheel.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isSpinning() {
        return false;
    }
    
    private final void setSpinning(boolean p0) {
    }
    
    public final float getProgress() {
        return 0.0F;
    }
    
    public final void setProgress(float progress) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void setAnimationEnabled() {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    /**
     * * Use onSizeChanged instead of onAttachedToWindow to get the dimensions of the view,
     *     * because this method is called after measuring the dimensions of MATCH_PARENT & WRAP_CONTENT.
     *     * Use this dimensions to setup the bounds and paints.
     */
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    /**
     * * Set the properties of the paints we're using to
     *     * draw the progress wheel
     */
    private final void setupPaints() {
    }
    
    /**
     * * Set the bounds of the component
     */
    private final void setupBounds(int layout_width, int layout_height) {
    }
    
    /**
     * * Parse the attributes passed to the view from the XML
     *     *
     *     * @param a the attributes to parse
     */
    private final void parseAttributes(android.content.res.TypedArray a) {
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.weike.education.utils.ProgressWheel.ProgressCallback progressCallback) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onVisibilityChanged(@org.jetbrains.annotations.NotNull()
    android.view.View changedView, int visibility) {
    }
    
    private final void updateBarLength(long deltaTimeInMilliSeconds) {
    }
    
    /**
     * * Reset the count (in increment mode)
     */
    public final void resetCount() {
    }
    
    /**
     * * Turn off spin mode
     */
    public final void stopSpinning() {
    }
    
    /**
     * * Puts the view on spin mode
     */
    public final void spin() {
    }
    
    private final void runCallback(float value) {
    }
    
    private final void runCallback() {
    }
    
    /**
     * * Set the progress to a specific value,
     *     * the bar will be set instantly to that value
     *     *
     *     * @param progress the progress between 0 and 1
     */
    public final void setInstantProgress(float progress) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    /**
     * * Sets the determinate progress mode
     *     *
     *     * @param isLinear if the progress should increase linearly
     */
    public final void setLinearProgress(boolean isLinear) {
    }
    
    /**
     * * @return the radius of the wheel in pixels
     */
    public final int getCircleRadius() {
        return 0;
    }
    
    /**
     * * Sets the radius of the wheel
     *     *
     *     * @param circleRadius the expected radius, in pixels
     */
    public final void setCircleRadius(int circleRadius) {
    }
    
    /**
     * * @return the width of the spinning bar
     */
    public final int getBarWidth() {
        return 0;
    }
    
    /**
     * * Sets the width of the spinning bar
     *     *
     *     * @param barWidth the spinning bar width in pixels
     */
    public final void setBarWidth(int barWidth) {
    }
    
    /**
     * * @return the color of the spinning bar
     */
    public final int getBarColor() {
        return 0;
    }
    
    /**
     * * Sets the color of the spinning bar
     *     *
     *     * @param barColor The spinning bar color
     */
    public final void setBarColor(int barColor) {
    }
    
    /**
     * * @return the color of the wheel's contour
     */
    public final int getRimColor() {
        return 0;
    }
    
    /**
     * * Sets the color of the wheel's contour
     *     *
     *     * @param rimColor the color for the wheel
     */
    public final void setRimColor(int rimColor) {
    }
    
    /**
     * * @return the base spinning speed, in full circle turns per second
     *     * (1.0 equals on full turn in one second), this value also is applied for
     *     * the smoothness when setting a progress
     */
    public final float getSpinSpeed() {
        return 0.0F;
    }
    
    /**
     * * Sets the base spinning speed, in full circle turns per second
     *     * (1.0 equals on full turn in one second), this value also is applied for
     *     * the smoothness when setting a progress
     *     *
     *     * @param spinSpeed the desired base speed in full turns per second
     */
    public final void setSpinSpeed(float spinSpeed) {
    }
    
    /**
     * * @return the width of the wheel's contour in pixels
     */
    public final int getRimWidth() {
        return 0;
    }
    
    /**
     * * Sets the width of the wheel's contour
     *     *
     *     * @param rimWidth the width in pixels
     */
    public final void setRimWidth(int rimWidth) {
    }
    
    /**
     * * The constructor for the ProgressWheel
     */
    public ProgressWheel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * * The constructor for the ProgressWheel
     */
    public ProgressWheel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/utils/ProgressWheel$ProgressCallback;", "", "onProgressUpdate", "", "progress", "", "app_debug"})
    public static abstract interface ProgressCallback {
        
        /**
         * * Method to call when the progress reaches a value
         *         * in order to avoid float precision issues, the progress
         *         * is rounded to a float with two decimals.
         *         *
         *         *
         *         * In indeterminate mode, the callback is called each time
         *         * the wheel completes an animation cycle, with, the progress value is -1.0f
         *         *
         *         * @param progress a double value between 0.00 and 1.00 both included
         */
        public abstract void onProgressUpdate(float progress);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\tH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R\u001a\u0010(\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR\u001a\u0010+\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR\u001a\u0010.\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$\u00a8\u00066"}, d2 = {"Lcom/weike/education/utils/ProgressWheel$WheelSavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "barColor", "", "getBarColor", "()I", "setBarColor", "(I)V", "barWidth", "getBarWidth", "setBarWidth", "circleRadius", "getCircleRadius", "setCircleRadius", "fillRadius", "", "getFillRadius", "()Z", "setFillRadius", "(Z)V", "isSpinning", "setSpinning", "linearProgress", "getLinearProgress", "setLinearProgress", "mProgress", "", "getMProgress", "()F", "setMProgress", "(F)V", "mTargetProgress", "getMTargetProgress", "setMTargetProgress", "rimColor", "getRimColor", "setRimColor", "rimWidth", "getRimWidth", "setRimWidth", "spinSpeed", "getSpinSpeed", "setSpinSpeed", "writeToParcel", "", "out", "flags", "Companion", "app_debug"})
    public static final class WheelSavedState extends android.view.View.BaseSavedState {
        private float mProgress;
        private float mTargetProgress;
        private boolean isSpinning;
        private float spinSpeed;
        private int barWidth;
        private int barColor;
        private int rimWidth;
        private int rimColor;
        private int circleRadius;
        private boolean linearProgress;
        private boolean fillRadius;
        @org.jetbrains.annotations.NotNull()
        @android.annotation.SuppressLint(value = {"ParcelCreator"})
        private static final android.os.Parcelable.Creator<com.weike.education.utils.ProgressWheel.WheelSavedState> CREATOR = null;
        public static final com.weike.education.utils.ProgressWheel.WheelSavedState.Companion Companion = null;
        
        public final float getMProgress() {
            return 0.0F;
        }
        
        public final void setMProgress(float p0) {
        }
        
        public final float getMTargetProgress() {
            return 0.0F;
        }
        
        public final void setMTargetProgress(float p0) {
        }
        
        public final boolean isSpinning() {
            return false;
        }
        
        public final void setSpinning(boolean p0) {
        }
        
        public final float getSpinSpeed() {
            return 0.0F;
        }
        
        public final void setSpinSpeed(float p0) {
        }
        
        public final int getBarWidth() {
            return 0;
        }
        
        public final void setBarWidth(int p0) {
        }
        
        public final int getBarColor() {
            return 0;
        }
        
        public final void setBarColor(int p0) {
        }
        
        public final int getRimWidth() {
            return 0;
        }
        
        public final void setRimWidth(int p0) {
        }
        
        public final int getRimColor() {
            return 0;
        }
        
        public final void setRimColor(int p0) {
        }
        
        public final int getCircleRadius() {
            return 0;
        }
        
        public final void setCircleRadius(int p0) {
        }
        
        public final boolean getLinearProgress() {
            return false;
        }
        
        public final void setLinearProgress(boolean p0) {
        }
        
        public final boolean getFillRadius() {
            return false;
        }
        
        public final void setFillRadius(boolean p0) {
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel out, int flags) {
        }
        
        public WheelSavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcelable superState) {
            super(null);
        }
        
        private WheelSavedState(android.os.Parcel in) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/weike/education/utils/ProgressWheel$WheelSavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/weike/education/utils/ProgressWheel$WheelSavedState;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final android.os.Parcelable.Creator<com.weike.education.utils.ProgressWheel.WheelSavedState> getCREATOR() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/utils/ProgressWheel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}