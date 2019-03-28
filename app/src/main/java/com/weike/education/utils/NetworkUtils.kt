@file:Suppress("DEPRECATION")

package com.weike.education.utils

import android.content.*
import android.net.ConnectivityManager
import android.os.Build
import android.os.IBinder
import android.telephony.TelephonyManager
import com.weike.education.widget.NetworkService

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/27
 * desc: 网络实时监听
 */
object NetworkUtils {

    private val TAG = NetworkUtils::class.java.simpleName
    val NET_BROADCAST_ACTION = "com.network.state.action"
    val NET_STATE_NAME = "network_state"

    /**
     * 接受服务上发过来的广播
     */
    private val mReceiver = object : BroadcastReceiver() {

        override fun onReceive(context: Context, intent: Intent?) {
            if (intent != null) {
                /*
                  -1 为无网络连接
                   1 为WIFI
                   2 为移动网络
                */
                val CURRENT_NETWORK_STATE = intent.getIntExtra(NET_STATE_NAME, -1)
                when (CURRENT_NETWORK_STATE) {
                    -1 -> LogUtils.i(TAG, "网络更改为 无网络  CURRENT_NETWORK_STATE =$CURRENT_NETWORK_STATE")
                    1 -> LogUtils.i(TAG, "网络更改为 WIFI网络  CURRENT_NETWORK_STATE=$CURRENT_NETWORK_STATE")
                    2 -> LogUtils.i(TAG, "网络更改为 移动网络  CURRENT_NETWORK_STATE =$CURRENT_NETWORK_STATE")
                }
            }
        }
    }

    enum class NetType(var value: Int, var desc: String) {
        /**
         * 当前网络状态
         */
        None(1, "无网络连接"),
        Mobile(2, "移动网络"),
        Wifi(4, "Wifi网络"),
        Other(8, "未知网络")
    }

    /**
     * 获取ConnectivityManager
     */
    private fun getConnectivityManager(context: Context): ConnectivityManager {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    /**
     * 获取TelephonyManager
     */
    fun getTelephonyManager(context: Context): TelephonyManager {
        return context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    }

    /**
     * 判断网络是否连接
     */
    fun isConnected(context: Context): Boolean {
        val networkInfo = getConnectivityManager(context).activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

    /**
     * 判断当前网络是否正在连接中或则已连接
     */
    fun isConnectedOrConnecting(context: Context): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val nets = getConnectivityManager(context).allNetworks
            nets?.let {
                for (network in nets) {
                    val networkInfo = getConnectivityManager(context).getNetworkInfo(network)
                    if (networkInfo.isConnected) {
                        return true
                    }
                }
            }
        } else {
            val nets = getConnectivityManager(context).allNetworkInfo
            nets?.let {
                for (networkInfo in nets) {
                    if (networkInfo.isConnectedOrConnecting) {
                        return true
                    }
                }
            }
        }
        return false
    }

    /**
     * 获取当前网络类型（移动网络还是Wifi）
     */
    fun getConnectedType(context: Context): NetType {
        val NET = getConnectivityManager(context).activeNetworkInfo
        if (NET != null) {
            when (NET.subtype) {
                ConnectivityManager.TYPE_WIFI -> return NetType.Wifi
                ConnectivityManager.TYPE_MOBILE -> return NetType.Mobile
                else -> return NetType.Other
            }
        }
        return NetType.None
    }

    /**
     * 获取当前是否存在有效的Wifi连接
     */
    fun isWifiConnected(context: Context): Boolean {
        val networkInfo = getConnectivityManager(context).activeNetworkInfo
        return networkInfo != null && networkInfo.type == ConnectivityManager.TYPE_WIFI && networkInfo.isConnected
    }

    /**
     * 获取当前是否存在有效的网络连接
     */
    fun isMobileConnected(context: Context): Boolean {
        val networkInfo = getConnectivityManager(context).activeNetworkInfo
        return networkInfo != null && networkInfo.type == ConnectivityManager.TYPE_MOBILE && networkInfo.isConnected
    }

    /**
     * 开启服务,实时监听网络变化（需要在清单文件配置Service）
     */
    fun startNetService(context: Context) {
        // 注册广播
        val intentFilter = IntentFilter()
        intentFilter.addAction(NET_BROADCAST_ACTION)
        context.registerReceiver(mReceiver, intentFilter)
        // 开启服务
        val intent = Intent(context, NetworkService::class.java)
        context.bindService(intent, object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName, service: IBinder) {
            }

            override fun onServiceDisconnected(name: ComponentName) {
            }
        }, Context.BIND_AUTO_CREATE)
    }
}
