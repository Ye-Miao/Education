package com.weike.education.base

import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import android.view.View
import com.weike.education.R
import com.weike.education.utils.AppUtils
import com.weike.education.utils.ProgressWheel
import com.weike.education.utils.ToastUtils
import java.util.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/9
 * desc: 基础刷新Fragment
 *
 */
abstract class BaseRefreshActivity<T : BaseContract.BasePresenter<*>, K> : BaseInjectActivity<T>(), SwipeRefreshLayout.OnRefreshListener {
    protected var mRecycler: RecyclerView? = null
    protected var mRefresh: SwipeRefreshLayout? = null
    protected var mIsRefreshing = false
    protected var mList: MutableList<K>? = ArrayList()
    private var mLoading: ProgressWheel? = null

    protected fun initRefreshLayout() {
        mRefresh?.let {
            it.setColorSchemeResources(R.color.colorPrimary)
            mRecycler?.post {
                it.isRefreshing = true
                loadData()
            }
            it.setOnRefreshListener(this)
        }
    }

    override fun initWidget() {
        mRefresh = findViewById(R.id.refresh) as? SwipeRefreshLayout
        mRecycler = findViewById(R.id.recycler) as? RecyclerView
        mLoading = findViewById(R.id.loading) as? ProgressWheel
        initRefreshLayout()
        initRecyclerView()
    }

    override fun onRefresh() {
        clearData()
        loadData()
    }

    protected open fun clearData() {
        mIsRefreshing = true
    }

    override fun complete() {
        AppUtils.runOnUIDelayed({ mRefresh?.isRefreshing = false }, 650)
        if (mIsRefreshing) {
            mList?.clear()
            clear()
            ToastUtils.showToast("刷新成功")
        }
        mIsRefreshing = false
        mLoading?.visibility = View.GONE
    }

    protected open fun clear() {
    }

    override fun loadDatas() {
        // 有刷新控件才刷新数据
        mRefresh?.let {
            mLoading?.let {
                it.visibility = View.VISIBLE
                AppUtils.runOnUIDelayed({ loadData() }, 650)
            }
        } ?: super.loadData()
    }
}