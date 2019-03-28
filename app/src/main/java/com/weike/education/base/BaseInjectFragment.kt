package com.weike.education.base

import com.weike.education.App
import com.weike.education.di.component.DaggerFragmentComponent
import com.weike.education.di.component.FragmentComponent
import com.weike.education.di.module.FragmentModule
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/8
 * desc: 基础InjectFragment
 *
 */
abstract class BaseInjectFragment<T : BaseContract.BasePresenter<*>> : BaseFragment(), BaseContract.BaseView {

    @Inject
    lateinit var mPresenter: T

    protected val fragmentModule: FragmentModule get() = FragmentModule(this)

    protected val fragmentComponent: FragmentComponent
        get() = DaggerFragmentComponent.builder()
                .apiComponent(App.instance.mApiComponent)
                .fragmentModule(fragmentModule)
                .build()

    override fun showError(msg: String) {
    }

    override fun onDestroy() {
        mPresenter.detachView()
        super.onDestroy()
    }

    override fun complete() {
    }
}