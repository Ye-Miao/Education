package com.weike.education.ui.activity.course

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.media.AudioManager
import android.net.Uri
import android.view.GestureDetector
import android.view.View
import com.weike.education.R
import com.weike.education.base.BaseActivity
import com.weike.education.media.MediaController
import com.weike.education.media.VideoPlayerView
import com.weike.education.media.callback.VideoBackListener
import kotlinx.android.synthetic.main.layout_video.*
import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/4
 * desc: 自定义视频播放activity
 *
 */
class VideoPlayerActivity : BaseActivity(), VideoBackListener {

    private var mStartText = "初始化播放器..."
    private var mLoadingAnim: AnimationDrawable? = null
    private var mLastPosition = 0L
    // 点击纵坐标L
    private var downX = 0f
    // 点击横坐标
    private var downY = 0f
    // 媒体音量管理
    private var audioManager: AudioManager? = null
    // 屏幕当前亮度百分比
    private var currentF = 0f
    private var mUrl: String? = ""
    private var mTitle: String? = ""
    private var mGestureDetector: GestureDetector? = null
    private var mMediaController: MediaController? = null
    private var mMaxVolume: Int = 0

    override fun getLayoutId(): Int = R.layout.layout_video

    override fun initWidget() {
        super.initWidget()
        // 初始化播放器
        initMediaPlayer()
        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        mMaxVolume = audioManager!!.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val bundle = intent.getBundleExtra("bundle")
        bundle?.let {
            mUrl = bundle.getString("Url")
            mTitle = bundle.getString("title")
        }
    }

    private fun initMediaPlayer() {
        mMediaController = MediaController(this)
        mMediaController?.setTitle(mTitle)
        player_view.setMediaController(mMediaController)
        player_view.setMediaBufferingIndicator(rl_loading)
        player_view.requestFocus()
        player_view.setOnInfoListener(onInfoListener)
        player_view.setOnSeekCompleteListener(onSeekCompleteListener)
        player_view.setOnCompletionListener(onCompletionListener)
        player_view.setOnControllerEventsListener(onControllerEventsListener)
        // 设置返回键监听
        mMediaController?.setVideoBackEvent(this)
    }

    /**
     * 初始化加载动画
     */
    private fun initAnimation() {
        rl_start.visibility = View.VISIBLE
        mStartText = "$mStartText【完成】\n解析视频地址...【完成】"
        tv_start.text = mStartText
        mLoadingAnim = iv_video_loading?.background as AnimationDrawable
        mLoadingAnim?.start()
    }

    /**
     * 视频缓冲事件回调
     */
    private val onInfoListener = IMediaPlayer.OnInfoListener { _, what, _ ->
        if (what == IMediaPlayer.MEDIA_INFO_BUFFERING_END) {
            rl_loading?.visibility = View.GONE
        }
        true
    }

    /**
     * 视频跳转事件回调
     */
    private val onSeekCompleteListener = IMediaPlayer.OnSeekCompleteListener {
    }

    /**
     * 视频播放完成事件回调
     */
    private val onCompletionListener = IMediaPlayer.OnCompletionListener {
        player_view.pause()
    }

    /**
     * 控制条控制状态事件回调
     */
    private val onControllerEventsListener = object : VideoPlayerView.OnControllerEventsListener {
        override fun onVideoPause() {
        }

        override fun onVideoResume() {
        }
    }

    override fun onResume() {
        super.onResume()
        if (player_view != null && !player_view.isPlaying) {
            player_view?.seekTo(mLastPosition)
        }
    }

    override fun onPause() {
        super.onPause()
        player_view?.let {
            mLastPosition = player_view.currentPosition.toLong()
            player_view.pause()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        mLoadingAnim?.let {
            mLoadingAnim?.stop()
            mLoadingAnim = null
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (player_view != null && player_view.isDrawingCacheEnabled) {
            player_view?.destroyDrawingCache()
        }
        mLoadingAnim?.let {
            mLoadingAnim?.stop()
            mLoadingAnim = null
        }
    }

    /**
     * 退出界面回调
     */
    override fun back() {
        onBackPressed()
    }

    override fun loadData() {
        initAnimation()
        player_view.setVideoURI(Uri.parse(mUrl))
        player_view.setOnPreparedListener {
            mLoadingAnim?.stop()
            mStartText = "$mStartText【完成】\n视频缓冲中..."
            tv_start?.text = mStartText
            rl_loading?.visibility = View.GONE
        }
        gone(rl_start)
    }
}