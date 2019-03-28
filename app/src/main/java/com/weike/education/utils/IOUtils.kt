package com.weike.education.utils

import java.io.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/14
 * desc:
 *
 */
class IOUtils {

    /**
     * 输入流保存到文件
     *
     * @param source 输入流来源
     * @param targetPath 目标文件路径
     * @return 文件路径
     */
    fun stream2file(source: InputStream, targetPath: String): String? {
        val target = File(targetPath)
        var inBuff: BufferedInputStream? = null
        var outBuff: BufferedOutputStream? = null
        try {
            if (!target.exists()) {
                val dir = targetPath.substring(0, targetPath.lastIndexOf("/"))
                File(dir).mkdirs()
                try {
                    target.createNewFile()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
            inBuff = BufferedInputStream(source)
            outBuff = BufferedOutputStream(FileOutputStream(target))
            val b = ByteArray(1024 * 5)
            var len = inBuff.read(b)
            while ((len) != -1) {
                outBuff.write(b, 0, len)
            }
            outBuff.flush()
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                inBuff?.close()
                outBuff?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        if (target.length() > 0) {
            return target.absolutePath
        } else {
            target.delete()
            return null
        }
    }

    /**
     * 字节数组转输入流
     *
     * @param data 字节数组
     * @return 输入流
     */
    fun Byte2InputStream(data: ByteArray): InputStream {
        return ByteArrayInputStream(data)
    }

    /**
     * 输入流转字节数组
     *
     * @param is 输入流
     * @return 字节数组
     */
    fun InputStream2Bytes(`is`: InputStream): ByteArray? {
        var str = ""
        val readByte = ByteArray(1024)
        try {
            while (`is`.read(readByte, 0, 1024) != -1) {
                str += String(readByte).trim { it <= ' ' }
            }
            return str.toByteArray()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }

    companion object {

        /**
         * 关闭io对象
         *
         * @param closeable
         */
        fun close(closeable: Closeable?) {
            if (closeable != null) {
                try {
                    closeable.close()
                } catch (e: IOException) {
                    throw RuntimeException("IOException occurred. ", e)
                }
            }
        }

        /**
         * 输入流转字符串
         *
         * @param inputStream inputStream
         * @return 字符串转换之后的
         */
        fun streamToString(inputStream: InputStream): String {
            try {
                val out = ByteArrayOutputStream()

                val buffer = ByteArray(1024)
                var len = inputStream.read(buffer)
                while ((len) != -1) {
                    out.write(buffer, 0, len)
                    out.flush()
                }

                val result = out.toString()
                out.close()
                inputStream.close()
                return result
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return ""
        }

        /**
         * 读文件到字节数组
         *
         * @param file
         * @return
         * @throws IOException
         */
        @Throws(IOException::class)
        fun getFileBytes(file: File): ByteArray {
            var bis: BufferedInputStream? = null
            try {
                bis = BufferedInputStream(FileInputStream(file))
                val bytes = file.length().toInt()
                val buffer = ByteArray(bytes)
                val readBytes = bis.read(buffer)
                if (readBytes != buffer.size) {
                    throw IOException("Entire file not read")
                }
                return buffer
            } finally {
                bis?.close()
            }
        }
    }
}
