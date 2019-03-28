package com.weike.education.network.helper

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * @author ym
 * created at 2018/8/23 9:31
 * desc: okhttp辅助类
 */
object OkHttpHelper {
    // 连接时长
    val DEFAULT_CONNECT_TIMEOUT_MILLIS = 20 * 1000
    // 写入时长
    val DEFAULT_WIRTE_TIMEOUT_MILLS = 20 * 1000
    // 读取时长
    val DEFAULT_READ_TIMEOUOT_MILLS = 20 * 1000

    @Volatile
    private var mOkHttpClient: OkHttpClient

    init {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        mOkHttpClient = OkHttpClient.Builder()
                .connectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS.toLong(), TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_WIRTE_TIMEOUT_MILLS.toLong(), TimeUnit.MILLISECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUOT_MILLS.toLong(), TimeUnit.MILLISECONDS)
                // 失败重连
                .retryOnConnectionFailure(true)
                // 打印网络信息
                .addInterceptor(httpLoggingInterceptor)
                // cookie持久化
//                .addInterceptor(ReadCookiesInterceptor())
//                .addInterceptor(SaveCookiesInterceptor())
                .build()
    }

    fun getOkHttpClient(): OkHttpClient = mOkHttpClient

    // 读取Cookie的拦截器
//    class ReadCookiesInterceptor : Interceptor {
//        override fun intercept(chain: Interceptor.Chain): Response {
//            val builder = chain.request().newBuilder()
//            val cookies = App.instance.getCookies()
//            for (cookie in cookies) {
//                builder.addHeader("Cookie", cookie)
//            }
//            return chain.proceed(builder.build())
//        }
//    }

    // 存储Cookie的拦截器
//    class SaveCookiesInterceptor : Interceptor {
//        override fun intercept(chain: Interceptor.Chain): Response {
//            val originalResponse = chain.proceed(chain.request())
//            if (!originalResponse.headers("Set-Cookie").isEmpty()) {
//                val cookies = HashSet<String>()
//                for (header in originalResponse.headers("Set-Cookie")) {
//                    cookies.add(header)
//                }
//                App.instance.setCookies(cookies)
//            }
//            return originalResponse
//        }
//    }
}
