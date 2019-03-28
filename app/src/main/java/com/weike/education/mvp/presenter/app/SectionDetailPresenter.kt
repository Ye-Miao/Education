package com.weike.education.mvp.presenter.app

import com.weike.education.base.RxPresenter
import com.weike.education.mvp.contract.app.SectionDetailContract
import com.weike.education.network.helper.RetrofitHelper
import javax.inject.Inject

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/5
 * desc:
 *
 */
class SectionDetailPresenter @Inject constructor(private val mRetrofitHelper: RetrofitHelper) :
        RxPresenter<SectionDetailContract.View>(), SectionDetailContract.Presenter<SectionDetailContract.View>