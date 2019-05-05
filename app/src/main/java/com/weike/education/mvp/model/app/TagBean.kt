package com.weike.education.mvp.model.app

import android.os.Parcel
import android.os.Parcelable

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/12/18
 * desc:
 *
 */
class TagBean(val id: String, val multiType: String,
              val showNext: Boolean, val subTags: List<SubTag>,
              val title: String) : Parcelable {

    data class SubTag(val nextStage: String, val tagId: Int, val tagName: String, val tagType: String)

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            1 == source.readInt(),
            ArrayList<SubTag>().apply { source.readList(this, SubTag::class.java.classLoader) },
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(id)
        writeString(multiType)
        writeInt((if (showNext) 1 else 0))
        writeList(subTags)
        writeString(title)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<TagBean> = object : Parcelable.Creator<TagBean> {
            override fun createFromParcel(source: Parcel): TagBean = TagBean(source)
            override fun newArray(size: Int): Array<TagBean?> = arrayOfNulls(size)
        }
    }
}
