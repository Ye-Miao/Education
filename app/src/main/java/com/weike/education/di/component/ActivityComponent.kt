package com.weike.education.di.component

import android.app.Activity

import com.weike.education.di.module.ActivityModule
import com.weike.education.di.scope.ActivityScope
import com.weike.education.ui.activity.app.ChoosePhaseActivity
import com.weike.education.ui.activity.app.MainActivity
import com.weike.education.ui.activity.app.WebViewActivity

import dagger.Component

/**
 * @author: ym
 * date: 2018/9/10
 * desc:ActivityComponent
 */
@ActivityScope
@Component(dependencies = [ApiComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    val activity: Activity

    fun inject(activity: MainActivity)

    fun inject(activity: ChoosePhaseActivity)

    fun inject(activity: WebViewActivity)
}
