package com.weike.education.mvp.contract.app

import com.weike.education.base.BaseContract
import com.weike.education.mvp.model.app.DiscoveryCommentBean
import com.weike.education.mvp.model.app.TagSuccessBean

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/16
 * desc: 主界面- MainContract
 *
 */
interface MainContract {

    interface View : BaseContract.BaseView {

        fun showDiscoveryBean(mDiscoveryCommentBean: DiscoveryCommentBean)

        fun showSetTag(tagSuccessBean: TagSuccessBean)
    }

    interface Presenter<in T> : BaseContract.BasePresenter<T> {

        /**
         * @param tagId [所处阶段Id,阶段对应级别（如初中->初一、初二、初三）]
         * @return
         */
        fun getRegionTagTypeBean(tagId: ArrayList<Int>)
    }
}