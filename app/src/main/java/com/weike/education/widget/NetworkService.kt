@file:Suppress("DEPRECATION")

package com.weike.education.widget

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.IBinder
import com.weike.education.utils.NetworkUtils

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/27
 * desc: 网络监听服务
 */
class NetworkService : Service() {

    private val mReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val info = connectivityManager.activeNetworkInfo
            if (info == null) {
                networkBroadCast(context, intent, -1)
                return
            }
            val type = info.type
            when (type) {
                ConnectivityManager.TYPE_MOBILE -> networkBroadCast(context, intent, 1)
                ConnectivityManager.TYPE_WIFI -> networkBroadCast(context, intent, 2)
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        val filter = IntentFilter()
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(mReceiver, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(mReceiver)
    }

    private fun networkBroadCast(context: Context, intent: Intent, status: Int) {
        intent.action = NetworkUtils.NET_BROADCAST_ACTION
        intent.putExtra(NetworkUtils.NET_STATE_NAME, status)
        context.sendBroadcast(intent)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
