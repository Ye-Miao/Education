package com.weike.education.ui.activity.app

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import android.view.animation.BounceInterpolator
import android.view.animation.DecelerateInterpolator
import com.weike.education.R
import com.weike.education.base.BaseActivity
import com.weike.education.utils.StatusBarUtil
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.concurrent.TimeUnit

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/14
 * desc:
 */
class SplashActivity : BaseActivity() {

    private var alphaAnim: ObjectAnimator? = null
    private var desAnim: ObjectAnimator? = null
    private var nameAnim: ObjectAnimator? = null

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun initWidget() = StatusBarUtil.setTransparent(this)

    override fun loadData() {
        super.loadData()
        alphaAnim = ObjectAnimator.ofFloat(txt_des, "alpha", 1f)
        desAnim = ObjectAnimator.ofFloat(txt_des, "translationX", -500f, 0f)
        desAnim?.duration = 700
        desAnim?.interpolator = DecelerateInterpolator()
        desAnim?.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator) {
                txt_name.visibility = View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animator) {
                txt_name.visibility = View.VISIBLE
            }
        })
        nameAnim = ObjectAnimator.ofFloat(txt_name, "translationY", -500f, 0f)
        nameAnim?.duration = 2000
        nameAnim?.interpolator = BounceInterpolator()
        nameAnim?.addListener(object : AnimatorListenerAdapter() {
            @SuppressLint("CheckResult")
            override fun onAnimationEnd(animation: Animator) {
                Observable.timer(500, TimeUnit.MILLISECONDS).subscribe { go2Main() }
            }
        })

        val animSet = AnimatorSet()
        animSet.play(desAnim).with(alphaAnim).before(nameAnim)
        animSet.start()
    }

    private fun go2Main() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        alphaAnim?.cancel()
        desAnim?.cancel()
        nameAnim?.cancel()
    }
}
