package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/9/27
 * * desc: 网络实时监听
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/weike/education/utils/NetworkUtils;", "", "()V", "NET_BROADCAST_ACTION", "", "getNET_BROADCAST_ACTION", "()Ljava/lang/String;", "NET_STATE_NAME", "getNET_STATE_NAME", "TAG", "kotlin.jvm.PlatformType", "mReceiver", "com/weike/education/utils/NetworkUtils$mReceiver$1", "Lcom/weike/education/utils/NetworkUtils$mReceiver$1;", "getConnectedType", "Lcom/weike/education/utils/NetworkUtils$NetType;", "context", "Landroid/content/Context;", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "isConnected", "", "isConnectedOrConnecting", "isMobileConnected", "isWifiConnected", "startNetService", "", "NetType", "app_release"})
public final class NetworkUtils {
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NET_BROADCAST_ACTION = "com.network.state.action";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NET_STATE_NAME = "network_state";
    
    /**
     * * 接受服务上发过来的广播
     */
    private static final android.content.BroadcastReceiver mReceiver = null;
    public static final com.weike.education.utils.NetworkUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNET_BROADCAST_ACTION() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNET_STATE_NAME() {
        return null;
    }
    
    /**
     * * 获取ConnectivityManager
     */
    private final android.net.ConnectivityManager getConnectivityManager(android.content.Context context) {
        return null;
    }
    
    /**
     * * 获取TelephonyManager
     */
    @org.jetbrains.annotations.NotNull()
    public final android.telephony.TelephonyManager getTelephonyManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * 判断网络是否连接
     */
    public final boolean isConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * 判断当前网络是否正在连接中或则已连接
     */
    public final boolean isConnectedOrConnecting(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * 获取当前网络类型（移动网络还是Wifi）
     */
    @org.jetbrains.annotations.NotNull()
    public final com.weike.education.utils.NetworkUtils.NetType getConnectedType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * 获取当前是否存在有效的Wifi连接
     */
    public final boolean isWifiConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * 获取当前是否存在有效的网络连接
     */
    public final boolean isMobileConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * 开启服务,实时监听网络变化（需要在清单文件配置Service）
     */
    public final void startNetService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private NetworkUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/weike/education/utils/NetworkUtils$NetType;", "", "value", "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getValue", "()I", "setValue", "(I)V", "None", "Mobile", "Wifi", "Other", "app_release"})
    public static enum NetType {
        /*public static final*/ None /* = new None(0, null) */,
        /*public static final*/ Mobile /* = new Mobile(0, null) */,
        /*public static final*/ Wifi /* = new Wifi(0, null) */,
        /*public static final*/ Other /* = new Other(0, null) */;
        private int value;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String desc;
        
        public final int getValue() {
            return 0;
        }
        
        public final void setValue(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDesc() {
            return null;
        }
        
        public final void setDesc(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        NetType(int value, @org.jetbrains.annotations.NotNull()
        java.lang.String desc) {
        }
    }
}