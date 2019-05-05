package com.weike.education.ui.fragment.app

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import com.weike.education.Constants
import com.weike.education.R
import com.weike.education.base.BaseFragment
import com.weike.education.mvp.model.app.TagBean
import com.weike.education.ui.activity.app.ChoosePhaseActivity
import kotlinx.android.synthetic.main.fragment_discovery.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/10
 * desc: 发现课程
 *
 */

class DiscoveryFragment : BaseFragment() {
    private lateinit var mStagesType: TagBean
    private val mTitles = mutableListOf<String>()
    private val mFragments = mutableListOf<Fragment>()
    private val CHOOSE_REQUESTCODE = 1
    private var numbers = ArrayList<Int>()
    private var title: String? = null

    override fun getLayoutId(): Int = R.layout.fragment_discovery

    companion object {
        fun newInstance(mSubTag: TagBean?, numbers: ArrayList<Int>?, title: String?): DiscoveryFragment {
            val fragment = DiscoveryFragment()
            val bundle = Bundle()
            bundle.putParcelable(Constants.EXTRA_DISCOVERY, mSubTag)
            bundle.putIntegerArrayList(Constants.EXTRA_NEXTLIST, numbers)
            bundle.putString(Constants.EXTRA_TITLE, title)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun initVariables() {
        arguments?.let {
            mStagesType = it.getParcelable<Parcelable>(Constants.EXTRA_DISCOVERY) as TagBean
            numbers = it.getIntegerArrayList(Constants.EXTRA_NEXTLIST)!!
            title = it.getString(Constants.EXTRA_TITLE)
        }
        toolbar_text.text = title
        mTitles.add("精选")
        mFragments.add(SectionFragment.newInstance())
        mStagesType.subTags.forEach { (_, tagId, tagName, _) ->
            mTitles.add(tagName)
            // 其它标签Tag页面
            mFragments.add(SectionTypeFragment.newInstance(tagId))
        }
    }

    override fun initWidget() {
        toolbar_text.setOnClickListener {
            val intent = Intent(activity, ChoosePhaseActivity::class.java)
            intent.putIntegerArrayListExtra("number", numbers)
            activity?.startActivityForResult(intent, CHOOSE_REQUESTCODE)
        }
        view_pager.offscreenPageLimit = mStagesType.subTags.size + 1
        view_pager.adapter = BaseStagesTypeAdapter(childFragmentManager, mTitles, mFragments)
        discovery_tabs.setViewPager(view_pager)
        view_pager.currentItem = 0
    }
}