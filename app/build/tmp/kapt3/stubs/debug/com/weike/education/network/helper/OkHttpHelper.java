package com.weike.education.network.helper;

import java.lang.System;

/**
 * * @author ym
 * * created at 2018/8/23 9:31
 * * desc: okhttp辅助类
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/weike/education/network/helper/OkHttpHelper;", "", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "Companion", "app_debug"})
public final class OkHttpHelper {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 20000;
    private static final int DEFAULT_WIRTE_TIMEOUT_MILLS = 20000;
    private static final int DEFAULT_READ_TIMEOUOT_MILLS = 20000;
    private static volatile com.weike.education.network.helper.OkHttpHelper sInstance;
    private static okhttp3.OkHttpClient mOkHttpClient;
    public static final com.weike.education.network.helper.OkHttpHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private OkHttpHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/weike/education/network/helper/OkHttpHelper$Companion;", "", "()V", "DEFAULT_CONNECT_TIMEOUT_MILLIS", "", "DEFAULT_READ_TIMEOUOT_MILLS", "DEFAULT_WIRTE_TIMEOUT_MILLS", "instance", "Lcom/weike/education/network/helper/OkHttpHelper;", "getInstance", "()Lcom/weike/education/network/helper/OkHttpHelper;", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "sInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.weike.education.network.helper.OkHttpHelper getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}