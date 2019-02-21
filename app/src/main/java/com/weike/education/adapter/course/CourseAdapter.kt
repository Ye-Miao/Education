package com.weike.education.adapter.course

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.weike.education.R
import com.weike.education.model.course.CourseCategoryFragment
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
                0 ->
                    //全部课
                    mFragment[position] = CourseCategoryFragment.newInstance(1)
                1 ->
                    //付费课
                    mFragment[position] = CourseCategoryFragment.newInstance(2)
                2 ->
                    //公开课
                    mFragment[position] = CourseCategoryFragment.newInstance(3)
                3 ->
                    //过期课
                    mFragment[position] = CourseCategoryFragment.newInstance(4)
            }
        }
        return mFragment[position]
    }

    override fun getCount(): Int = mTitles.size

    override fun getPageTitle(position: Int): CharSequence = mTitles[position]
}