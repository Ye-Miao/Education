package com.weike.education.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/9
 * desc: 关闭IO流
 */
public final class CloseUtils {

    public CloseUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void closeIO(final Closeable... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
