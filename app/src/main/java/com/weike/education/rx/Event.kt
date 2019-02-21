package com.weike.education.rx

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/28
 * desc: 事件
 *
 */
class Event {
    class DiscoveryCommentEvent {
        var number: ArrayList<Int>? = null
    }

    class ChooseLeftSelectItem {
        var number: Int? = 0
    }

    class CategorSelectItem {
        var position: Int? = 0
    }
}
