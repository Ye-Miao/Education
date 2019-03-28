package com.weike.education.di.module

import android.app.Activity
import android.support.v4.app.Fragment

import com.weike.education.di.scope.FragmentScope

import dagger.Module
import dagger.Provides

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Fragment模型
 */
@Module
class FragmentModule(val fragment: Fragment) {

    @Provides
    @FragmentScope
    fun provideActivity(): Activity = fragment.activity!!

}
