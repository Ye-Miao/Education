package com.weike.education.base

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import com.weike.education.App
import com.weike.education.R
import com.weike.education.utils.AppUtils
import com.weike.education.utils.StatusBarUtil

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/7
 * desc: 基础BaseActivity
 *
 */
abstract class BaseActivity : RxAppCompatActivity() {

    protected var mContext: Context? = null
    protected var mToolbar: Toolbar? = null
    protected open val mBack = true // 是否返回

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        mToolbar = findViewById(R.id.toolbar) as? Toolbar
        mContext = this
        initStatusBar()
        initInject()
        initPresenter()
        initVariables()
        App.instance.addActivity(this)
        mToolbar?.let {
            // 初始化Toolbar
            // initToolbar()
            // 组件化Toolbar
            setSupportActionBar(it)
            if (mBack) it.setNavigationOnClickListener { finish() }
        }
        initWidget()
        loadDatas()
    }

    open fun initVariables() {}

    open fun loadDatas() {
        loadData()
    }

    open fun initPresenter() {
    }

    open fun initInject() {
    }

    @SuppressLint("MissingSuperCall")
    override fun onSaveInstanceState(outState: Bundle) {
        // 如果用以下这种做法则不保存状态，再次进来的话会显示默认tab
        // 总是执行这句代码来调用父类去保存视图层的状态
        // super.onSaveInstanceState(outState);
    }

    open fun initToolbar() {
        if (mBack) mToolbar?.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
    }

    private fun initStatusBar() = StatusBarUtil.setColorNoTranslucent(mContext as Activity, AppUtils.getColor(R.color.colorPrimary))

    abstract fun getLayoutId(): Int

    /**
     * 初始化控件
     */
    open fun initWidget() {}

    /**
     * 加载数据
     */
    open fun loadData() {}

    override fun onDestroy() {
        super.onDestroy()
        App.instance.removeActivity(this)
    }

    fun initRecyclerView() {}

    /**
     * 隐藏View
     * @param views 视图
     */
    fun gone(vararg views: View) {
        if (views.isNotEmpty()) {
            for (view in views) {
                view.visibility = View.GONE
            }
        }
    }

    /**
     * 显示View 不占位置
     * @param views 视图
     */
    fun visible(vararg views: View) {
        if (views.isNotEmpty()) {
            for (view in views) {
                view.visibility = View.VISIBLE
            }
        }
    }

    /**
     * 显示View
     * @param views 视图
     */
    fun inVisible(vararg views: View) {
        if (views.isNotEmpty()) {
            for (view in views) {
                view.visibility = View.INVISIBLE
            }
        }
    }
}
