package com.weike.education.ui.fragment.mine

import android.annotation.SuppressLint
import android.content.Intent
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.weike.education.R
import com.weike.education.base.BaseInjectFragment
import com.weike.education.mvp.model.mine.MineBean
import com.weike.education.mvp.contract.mine.MineContract
import com.weike.education.mvp.presenter.mine.MinePresenter
import com.weike.education.ui.activity.mine.CacheRecordActivity
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/9
 * desc: 我的
 *
 */
class MineFragment : BaseInjectFragment<MinePresenter>(), MineContract.View {

    override fun getLayoutId(): Int = R.layout.fragment_mine

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initInject() = fragmentComponent.inject(this)

    companion object {
        fun newInstance(): MineFragment {
            return MineFragment()
        }
    }

    override fun initVariables() {
        icon_cacheRecord.setOnClickListener {
            startActivity(Intent(mContext, CacheRecordActivity::class.java))
        }
    }

    @SuppressLint("SetTextI18n")
    override fun showMine(mineBean: MineBean) {
        Glide.with(this)
                .load(mineBean.avatar)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(image)

        user_name.text = mineBean.nickname
        item_coupon_text.text = "${mineBean.couponCount}张"
    }
}