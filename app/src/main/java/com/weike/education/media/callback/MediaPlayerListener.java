package com.weike.education.media.callback;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/4
 * desc: 视频接口回调
 */
public interface MediaPlayerListener {

    /**
     * 播放
     */
    void play();

    /**
     * 暂停
     */
    void pause();

    /**
     * 是否正在播放
     */
    boolean isPlaying();

    /**
     * 获取视频时间
     */
    int getDuration();

    /**
     * 获取当前播放位置
     */
    int getCurrentPosition();

    /**
     * 获取视频加载百分比
     */
    int getBufferPercentage();

    /**
     * 能暂停
     */
    boolean canPause();

    /**
     * 跳转指定位置
     *
     * @param pos 具体位置
     */
    void seekTo(long pos);

}
