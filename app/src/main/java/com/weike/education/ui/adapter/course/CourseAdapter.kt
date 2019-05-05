package com.weike.education.ui.adapter.course

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.weike.education.R
import com.weike.education.ui.fragment.course.CourseCategoryFragment
import com.weike.education.utils.AppUtils

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/30
 * desc: 我的课程Tag
 *
 */
class CourseAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var mTitles = AppUtils.getStringArray(R.array.course_title)
    private val mFragment = arrayOfNulls<Fragment>(mTitles.size)

    override fun getItem(position: Int): Fragment? {
        if (mFragment[position] == null) {
            when (position) {
                0, 1, 2, 3 -> mFragment[position] = CourseCategoryFragment.newInstance(position + 1)
            }
        }
        return mFragment[position]
    }

    override fun getCount(): Int = mTitles.size

    override fun getPageTitle(position: Int): CharSequence = mTitles[position]
}