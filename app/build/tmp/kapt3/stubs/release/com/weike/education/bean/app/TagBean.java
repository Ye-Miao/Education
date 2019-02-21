package com.weike.education.bean.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/12/18
 * * desc:
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/weike/education/bean/app/TagBean;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "multiType", "showNext", "", "subTags", "", "Lcom/weike/education/bean/app/TagBean$SubTag;", "title", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMultiType", "getShowNext", "()Z", "getSubTags", "()Ljava/util/List;", "getTitle", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "SubTag", "app_release"})
public final class TagBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String multiType = null;
    private final boolean showNext = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.weike.education.bean.app.TagBean.SubTag> subTags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.weike.education.bean.app.TagBean> CREATOR = null;
    public static final com.weike.education.bean.app.TagBean.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMultiType() {
        return null;
    }
    
    public final boolean getShowNext() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.weike.education.bean.app.TagBean.SubTag> getSubTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public TagBean(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String multiType, boolean showNext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.weike.education.bean.app.TagBean.SubTag> subTags, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super();
    }
    
    public TagBean(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/weike/education/bean/app/TagBean$SubTag;", "", "nextStage", "", "tagId", "", "tagName", "tagType", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getNextStage", "()Ljava/lang/String;", "getTagId", "()I", "getTagName", "getTagType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
    public static final class SubTag {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String nextStage = null;
        private final int tagId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tagName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tagType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNextStage() {
            return null;
        }
        
        public final int getTagId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTagName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTagType() {
            return null;
        }
        
        public SubTag(@org.jetbrains.annotations.NotNull()
        java.lang.String nextStage, int tagId, @org.jetbrains.annotations.NotNull()
        java.lang.String tagName, @org.jetbrains.annotations.NotNull()
        java.lang.String tagType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.weike.education.bean.app.TagBean.SubTag copy(@org.jetbrains.annotations.NotNull()
        java.lang.String nextStage, int tagId, @org.jetbrains.annotations.NotNull()
        java.lang.String tagName, @org.jetbrains.annotations.NotNull()
        java.lang.String tagType) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/bean/app/TagBean$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/weike/education/bean/app/TagBean;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}