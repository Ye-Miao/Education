package com.weike.education.utils

import android.content.Context
import android.content.res.AssetManager
import android.os.Environment
import java.io.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/14
 * desc: File文件工具类
 *
 */
object FileUtils {

    /**
     * 判断是否有SD卡
     */
    val isSdCardAvailable = Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()

    /**
     * 创建根缓存目录
     */
    fun createRootPath(context: Context): String {
        val cacheRootPath: String
        if (isSdCardAvailable) {
            // /sdcard/Android/data/<application package>/cache
            cacheRootPath = context.externalCacheDir!!.path
        } else {
            // /data/data/<application package>/cache
            cacheRootPath = context.cacheDir.path
        }
        return cacheRootPath
    }

    /**
     * 递归创建文件夹
     */
    fun createDir(dirPath: String): String {
        try {
            val file = File(dirPath)
            if (file.parentFile.exists()) {
                LogUtils.i("----- 创建文件夹" + file.absolutePath)
                file.mkdir()
                return file.absolutePath
            } else {
                createDir(file.parentFile.absolutePath)
                LogUtils.i("----- 创建文件夹" + file.absolutePath)
                file.mkdir()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return dirPath
    }

    /**
     * 递归创建文件夹
     */
    fun createFile(file: File): String {
        try {
            if (file.parentFile.exists()) {
                LogUtils.i("----- 创建文件夹" + file.absolutePath)
                file.createNewFile()
                return file.absolutePath
            } else {
                createDir(file.parentFile.absolutePath)
                file.createNewFile()
                LogUtils.i("----- 创建文件夹" + file.absolutePath)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

    /**
     * 写入文件流
     */
    fun writeFile(filePathAndName: String, fileContent: String) {
        try {
            val outStream = FileOutputStream(filePathAndName)
            val writerStream = OutputStreamWriter(outStream)
            writerStream.write(fileContent)
            writerStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    /**
     * 文件拷贝
     */
    fun fileChannelCopy(src: File, desc: File) {
        var fi: FileInputStream? = null
        var fo: FileOutputStream? = null
        try {
            fi = FileInputStream(src)
            fo = FileOutputStream(desc)
            val `in` = fi.channel // 得到对应的文件通道
            val out = fo.channel // 得到对应的文件通道
            `in`.transferTo(0, `in`.size(), out) // 连接两个通道，并且从in通道读取，然后写入out通道
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                fo?.close()
                fi?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    /**
     * 打开Asset下的文件
     */
    fun openAssetFile(context: Context, fileName: String): InputStream? {
        val am: AssetManager = context.assets
        var `is`: InputStream? = null
        try {
            `is` = am.open(fileName)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return `is`
    }
}
