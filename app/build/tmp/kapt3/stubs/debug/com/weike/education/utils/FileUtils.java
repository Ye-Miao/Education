package com.weike.education.utils;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/14
 * * desc: File文件工具类
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0007J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lcom/weike/education/utils/FileUtils;", "", "()V", "isSdCardAvailable", "", "()Z", "createDir", "", "dirPath", "createFile", "file", "Ljava/io/File;", "createRootPath", "context", "Landroid/content/Context;", "fileChannelCopy", "", "src", "desc", "openAssetFile", "Ljava/io/InputStream;", "fileName", "writeFile", "filePathAndName", "fileContent", "app_debug"})
public final class FileUtils {
    
    /**
     * * 判断是否有SD卡
     */
    private static final boolean isSdCardAvailable = false;
    public static final com.weike.education.utils.FileUtils INSTANCE = null;
    
    public final boolean isSdCardAvailable() {
        return false;
    }
    
    /**
     * * 创建根缓存目录
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createRootPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * * 递归创建文件夹
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createDir(@org.jetbrains.annotations.NotNull()
    java.lang.String dirPath) {
        return null;
    }
    
    /**
     * * 递归创建文件夹
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    /**
     * * 写入文件流
     */
    public final void writeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filePathAndName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileContent) {
    }
    
    /**
     * * 文件拷贝
     */
    public final void fileChannelCopy(@org.jetbrains.annotations.NotNull()
    java.io.File src, @org.jetbrains.annotations.NotNull()
    java.io.File desc) {
    }
    
    /**
     * * 打开Asset下的文件
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.InputStream openAssetFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    private FileUtils() {
        super();
    }
}