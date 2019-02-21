package com.weike.education.di.component

import android.app.Activity

import com.weike.education.di.module.FragmentModule
import com.weike.education.di.scope.FragmentScope
import com.weike.education.model.app.DiscoveryFragment
import com.weike.education.model.app.SectionFragment
import com.weike.education.model.app.SectionTypeFragment
import com.weike.education.model.course.CourseCategoryFragment
import com.weike.education.model.mine.MineFragment

import dagger.Component

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: FragmentComponent
 */
@FragmentScope
@Component(dependencies = [ApiComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    val activity: Activity

    fun inject(discoveryFragment: DiscoveryFragment)

    fun inject(selectionFragment: SectionFragment)

    fun inject(selectionTypeFragment: SectionTypeFragment)

    fun inject(mineFragment: MineFragment)

    fun inject(courseCategoryFragment: CourseCategoryFragment)
}
