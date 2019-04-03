package com.weike.education

import android.app.Activity
import android.app.Application
import com.weike.education.di.component.ApiComponent
import com.weike.education.di.component.DaggerApiComponent
import com.weike.education.di.module.ApiModule
import com.weike.education.utils.AppUtils
import com.weike.education.utils.CrashHandler
import com.weike.education.utils.LogUtils
import com.weike.education.utils.NetworkUtils

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/7
 * desc: App主入口
 * * #                                                   #
 * * #                       _oo0oo_                     #
 * * #                      o8888888o                    #
 * * #                      88" . "88                    #
 * * #                      (| -_- |)                    #
 * * #                      0\  =  /0                    #
 * * #                    ___/`---'\___                  #
 * * #                  .' \\|     |# '.                 #
 * * #                 / \\|||  :  |||# \                #
 * * #                / _||||| -:- |||||- \              #
 * * #               |   | \\\  -  #/ |   |              #
 * * #               | \_|  ''\---/''  |_/ |             #
 * * #               \  .-\__  '-'  ___/-. /             #
 * * #             ___'. .'  /--.--\  `. .'___           #
 * * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * * #                       `=---='                     #
 * * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * * #                                                   #
 * * #               佛祖保佑         永无BUG             #
 * * #                                                   #
 */

class App : Application() {
    private var allActivities: HashSet<Activity>? = null
    val mApiComponent: ApiComponent by lazy {
        DaggerApiComponent.builder()
                .apiModule(ApiModule())
                .build()
    }
//    private val mSp = getSharedPreferences(Constants.EXTRA_COOKIE, Context.MODE_PRIVATE)

    override fun onCreate() {
        super.onCreate()
        AppUtils.init(this)
        instance = this
        initNetwork()
        initCrashHandler()
        initLog()
    }

    companion object {
        lateinit var instance: App
    }

//    fun getCookies(): HashSet<String> =
//            mSp.getStringSet(Constants.EXTRA_COOKIE, HashSet<String>()) as HashSet<String>
//
//
//    fun setCookies(cookies: java.util.HashSet<String>) =
//            mSp.edit().putStringSet(Constants.EXTRA_COOKIE, cookies).apply()

    private fun initNetwork() = NetworkUtils.startNetService(this)

    private fun initCrashHandler() = CrashHandler.init(this)

    private fun initLog() = LogUtils.init(this)


    /**
     * 增加Activity
     * @param act act
     */
    fun addActivity(act: Activity) {
        if (allActivities == null) {
            allActivities = HashSet()
        } else {
            allActivities?.add(act)
        }
    }

    /**
     * 移除Activity
     * @param act act
     */
    fun removeActivity(act: Activity) {
        allActivities?.remove(act)
    }

    @Synchronized
    fun exitApp() {
        allActivities?.let {
            it.forEach { activity ->
                activity.finish()
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid())
        System.exit(0)
    }
}