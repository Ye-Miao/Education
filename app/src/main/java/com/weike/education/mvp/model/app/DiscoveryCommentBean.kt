package com.weike.education.mvp.model.app

import android.os.Parcel
import android.os.Parcelable

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/16
 * desc: 首页文字+list
 *
 */
data class DiscoveryCommentBean(val code: String, val `data`: Data, val msg: String) {

    data class Data(val stages: Stages, val startStage: String) {

        data class Stages(
                val `-11770465`: X11770465,
                val `-1241354076`: X1241354076,
                val `-1267607113`: X1267607113,
                val `-1643733803`: X1643733803,
                val `-340228195`: X340228195,
                val `-583494580`: X583494580,
                val `-608120637`: X608120637,
                val `-686187771`: X686187771,
                val `-739657361`: X739657361,
                val `-842753927`: X842753927,
                val `-855824338`: X855824338,
                val `1003657994`: X1003657994,
                val `1099221270`: X1099221270,
                val `1173426265`: X1173426265,
                val `1521900098`: X1521900098,
                val `154271985`: X154271985,
                val `1706214067`: X1706214067,
                val `1762259370`: X1762259370,
                val `1773877388`: X1773877388,
                val `1832454640`: X1832454640,
                val `1864008760`: X1864008760,
                val `386667459`: X386667459
        ) {

            data class X1267607113(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X154271985(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X583494580(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1762259370(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X842753927(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1832454640(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1643733803(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X855824338(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1241354076(val id: String, val multiType: String, val showNext: Boolean,val subTags: List<SubTag>, val title: String)

            data class X1706214067(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>,val title: String)

            data class X1521900098(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X686187771(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X11770465(val id: String, val multiType: String, val nextStage: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1003657994(val id: String, val multiType: String,val showNext: Boolean, val subTags: List<SubTag>,val title: String)

            data class X340228195(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1173426265(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X739657361(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1864008760(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X386667459(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1773877388(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X608120637(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class X1099221270(val id: String, val multiType: String, val showNext: Boolean, val subTags: List<SubTag>, val title: String)

            data class SubTag(val nextStage: String, val tagId: Int, val tagName: String, val tagType: String) : Parcelable {

                constructor(source: Parcel) : this(
                        source.readString(),
                        source.readInt(),
                        source.readString(),
                        source.readString()
                )

                override fun describeContents() = 0

                override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
                    writeString(nextStage)
                    writeInt(tagId)
                    writeString(tagName)
                    writeString(tagType)
                }

                companion object {
                    @JvmField
                    val CREATOR: Parcelable.Creator<SubTag> = object : Parcelable.Creator<SubTag> {
                        override fun createFromParcel(source: Parcel): SubTag = SubTag(source)
                        override fun newArray(size: Int): Array<SubTag?> = arrayOfNulls(size)
                    }
                }
            }
        }
    }
}