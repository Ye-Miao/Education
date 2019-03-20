package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/14
 * * desc:
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n\u00a8\u0006\u000e"}, d2 = {"Lcom/weike/education/utils/IOUtils;", "", "()V", "Byte2InputStream", "Ljava/io/InputStream;", "data", "", "InputStream2Bytes", "is", "stream2file", "", "source", "targetPath", "Companion", "app_debug"})
public final class IOUtils {
    public static final com.weike.education.utils.IOUtils.Companion Companion = null;
    
    /**
     * * 输入流保存到文件
     *     *
     *     * @param source     输入流来源
     *     * @param targetPath 目标文件路径
     *     * @return 文件路径
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String stream2file(@org.jetbrains.annotations.NotNull()
    java.io.InputStream source, @org.jetbrains.annotations.NotNull()
    java.lang.String targetPath) {
        return null;
    }
    
    /**
     * * 字节数组转输入流
     *     *
     *     * @param data 字节数组
     *     * @return 输入流
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.InputStream Byte2InputStream(@org.jetbrains.annotations.NotNull()
    byte[] data) {
        return null;
    }
    
    /**
     * * 输入流转字节数组
     *     *
     *     * @param is 输入流
     *     * @return 字节数组
     */
    @org.jetbrains.annotations.Nullable()
    public final byte[] InputStream2Bytes(@org.jetbrains.annotations.NotNull()
    java.io.InputStream is) {
        return null;
    }
    
    public IOUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/weike/education/utils/IOUtils$Companion;", "", "()V", "close", "", "closeable", "Ljava/io/Closeable;", "getFileBytes", "", "file", "Ljava/io/File;", "streamToString", "", "inputStream", "Ljava/io/InputStream;", "app_debug"})
    public static final class Companion {
        
        /**
         * * 关闭io对象
         *         *
         *         * @param closeable
         */
        public final void close(@org.jetbrains.annotations.Nullable()
        java.io.Closeable closeable) {
        }
        
        /**
         * * 输入流转字符串
         *         *
         *         * @param inputStream inputStream
         *         * @return 字符串转换之后的
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String streamToString(@org.jetbrains.annotations.NotNull()
        java.io.InputStream inputStream) {
            return null;
        }
        
        /**
         * * 读文件到字节数组
         *         *
         *         * @param file
         *         * @return
         *         * @throws IOException
         */
        @org.jetbrains.annotations.NotNull()
        public final byte[] getFileBytes(@org.jetbrains.annotations.NotNull()
        java.io.File file) throws java.io.IOException {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}