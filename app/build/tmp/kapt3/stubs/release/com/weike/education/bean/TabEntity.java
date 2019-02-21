package com.weike.education.bean;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/9
 * * desc: 底部custom标签类
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/weike/education/bean/TabEntity;", "Lcom/flyco/tablayout/listener/CustomTabEntity;", "title", "", "seledctedIcon", "", "unSelectedIcon", "(Ljava/lang/String;II)V", "getSeledctedIcon", "()I", "setSeledctedIcon", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getUnSelectedIcon", "setUnSelectedIcon", "getTabSelectedIcon", "getTabTitle", "getTabUnselectedIcon", "app_release"})
public final class TabEntity implements com.flyco.tablayout.listener.CustomTabEntity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int seledctedIcon;
    private int unSelectedIcon;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTabTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getTabSelectedIcon() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTabUnselectedIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSeledctedIcon() {
        return 0;
    }
    
    public final void setSeledctedIcon(int p0) {
    }
    
    public final int getUnSelectedIcon() {
        return 0;
    }
    
    public final void setUnSelectedIcon(int p0) {
    }
    
    public TabEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int seledctedIcon, int unSelectedIcon) {
        super();
    }
}