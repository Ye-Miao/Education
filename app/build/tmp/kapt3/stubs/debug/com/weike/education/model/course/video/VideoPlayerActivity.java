package com.weike.education.model.course.video;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/12/4
 * * desc: 自定义视频播放activity
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u001b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\"H\u0014J\b\u0010*\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\"H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/weike/education/model/course/video/VideoPlayerActivity;", "Lcom/weike/education/base/BaseActivity;", "Lcom/weike/education/media/callback/VideoBackListener;", "()V", "audioManager", "Landroid/media/AudioManager;", "currentF", "", "downX", "downY", "mGestureDetector", "Landroid/view/GestureDetector;", "mLastPosition", "", "mLoadingAnim", "Landroid/graphics/drawable/AnimationDrawable;", "mMaxVolume", "", "mMediaController", "Lcom/weike/education/media/MediaController;", "mStartText", "", "mTitle", "mUrl", "onCompletionListener", "Ltv/danmaku/ijk/media/player/IMediaPlayer$OnCompletionListener;", "onControllerEventsListener", "com/weike/education/model/course/video/VideoPlayerActivity$onControllerEventsListener$1", "Lcom/weike/education/model/course/video/VideoPlayerActivity$onControllerEventsListener$1;", "onInfoListener", "Ltv/danmaku/ijk/media/player/IMediaPlayer$OnInfoListener;", "onSeekCompleteListener", "Ltv/danmaku/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;", "back", "", "getLayoutId", "initAnimation", "initMediaPlayer", "initWidget", "loadData", "onBackPressed", "onDestroy", "onPause", "onResume", "app_debug"})
public final class VideoPlayerActivity extends com.weike.education.base.BaseActivity implements com.weike.education.media.callback.VideoBackListener {
    private java.lang.String mStartText;
    private android.graphics.drawable.AnimationDrawable mLoadingAnim;
    private long mLastPosition;
    private float downX;
    private float downY;
    private android.media.AudioManager audioManager;
    private float currentF;
    private java.lang.String mUrl;
    private java.lang.String mTitle;
    private android.view.GestureDetector mGestureDetector;
    private com.weike.education.media.MediaController mMediaController;
    private int mMaxVolume;
    
    /**
     * * 视频缓冲事件回调
     */
    private final tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener onInfoListener = null;
    
    /**
     * * 视频跳转事件回调
     */
    private final tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = null;
    
    /**
     * * 视频播放完成事件回调
     */
    private final tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener onCompletionListener = null;
    
    /**
     * * 控制条控制状态事件回调
     */
    private final com.weike.education.media.VideoPlayerView.OnControllerEventsListener onControllerEventsListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void initWidget() {
    }
    
    private final void initMediaPlayer() {
    }
    
    /**
     * * 初始化加载动画
     */
    private final void initAnimation() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * * 退出界面回调
     */
    @java.lang.Override()
    public void back() {
    }
    
    @java.lang.Override()
    public void loadData() {
    }
    
    public VideoPlayerActivity() {
        super();
    }
}