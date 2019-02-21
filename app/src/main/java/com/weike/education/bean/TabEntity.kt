package com.weike.education.bean

import com.flyco.tablayout.listener.CustomTabEntity

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/9
 * desc: 底部custom标签类
 */
class TabEntity(var title: String, var seledctedIcon: Int, var unSelectedIcon: Int) : CustomTabEntity {

    override fun getTabTitle(): String {
        return title
    }

    override fun getTabSelectedIcon(): Int {
        return seledctedIcon
    }

    override fun getTabUnselectedIcon(): Int {
        return unSelectedIcon
    }
}
