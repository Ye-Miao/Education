package com.weike.education.network.helper;

import java.lang.System;

/**
 * * @author ym
 * * created at 2018/8/23 9:31
 * * desc: okhttp辅助类
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/weike/education/network/helper/OkHttpHelper;", "", "()V", "DEFAULT_CONNECT_TIMEOUT_MILLIS", "", "getDEFAULT_CONNECT_TIMEOUT_MILLIS", "()I", "DEFAULT_READ_TIMEOUOT_MILLS", "getDEFAULT_READ_TIMEOUOT_MILLS", "DEFAULT_WIRTE_TIMEOUT_MILLS", "getDEFAULT_WIRTE_TIMEOUT_MILLS", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "app_debug"})
public final class OkHttpHelper {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 20000;
    private static final int DEFAULT_WIRTE_TIMEOUT_MILLS = 20000;
    private static final int DEFAULT_READ_TIMEOUOT_MILLS = 20000;
    private static volatile okhttp3.OkHttpClient mOkHttpClient;
    public static final com.weike.education.network.helper.OkHttpHelper INSTANCE = null;
    
    public final int getDEFAULT_CONNECT_TIMEOUT_MILLIS() {
        return 0;
    }
    
    public final int getDEFAULT_WIRTE_TIMEOUT_MILLS() {
        return 0;
    }
    
    public final int getDEFAULT_READ_TIMEOUOT_MILLS() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private OkHttpHelper() {
        super();
    }
}