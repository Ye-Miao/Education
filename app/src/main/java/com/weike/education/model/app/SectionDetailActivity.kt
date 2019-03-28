package com.weike.education.model.app

import android.annotation.SuppressLint
import android.view.View
import android.webkit.*
import com.weike.education.R
import com.weike.education.base.BaseInjectActivity
import com.weike.education.mvp.contract.app.SectionDetailContract
import com.weike.education.mvp.presenter.app.SectionDetailPresenter
import kotlinx.android.synthetic.main.activity_section_detail.*

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2019/1/5
 * desc:
 *
 */
class SectionDetailActivity : BaseInjectActivity<SectionDetailPresenter>(), SectionDetailContract.View {

    private var mUrl = "https://ke.youdao.com/course/detail/18906?inLoc=fp_h_0&Pdt=CourseWeb"

    override fun getLayoutId(): Int = R.layout.activity_section_detail

    override fun initInject() = activityComponent.inject(this)

    override fun initPresenter() = mPresenter.attachView(this)

    override fun initWidget() {
        // 必须调用这个，不然效果无效
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { finish() }
        initWebView()
    }

    internal inner class WebClientBase : WebViewClient() {

        override fun onPageFinished(webView: WebView, s: String) {
            super.onPageFinished(webView, s)
            web_view.settings.blockNetworkImage = false
            val h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
            val w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
            web_view.measure(w, h)
            web_view.loadUrl("javascript:function setTop(){document.querySelector('#bannercontainer').style.display=\"none\";}setTop();")
        }

        override fun onReceivedHttpError(view: WebView?, request: WebResourceRequest?, errorResponse: WebResourceResponse?) {
            super.onReceivedHttpError(view, request, errorResponse)
            val errorHtml = "<html><body><h2>找不到网页</h2></body></html>"
            web_view.loadDataWithBaseURL(null, errorHtml, "text/html", "UTF-8", null)
        }
    }

    internal inner class WebClient : WebChromeClient() {

        override fun onProgressChanged(webView: WebView, i: Int) {
            web_view.settings.blockNetworkImage = false
            web_view.loadUrl("javascript:function setTop(){document.querySelector('#bannercontainer').style.display=\"none\";}setTop();")
            super.onProgressChanged(webView, i)
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView() {
        val webChromeClient = WebClient()
        val webViewClient = WebClientBase()
        val webSettings = web_view.settings
        // js支持
        webSettings.javaScriptEnabled = true
        // js脚本
        webSettings.javaScriptCanOpenWindowsAutomatically = false
        // 设置缓存
        webSettings.cacheMode = WebSettings.LOAD_NO_CACHE
        webSettings.domStorageEnabled = true
        webSettings.setGeolocationEnabled(true)
        webSettings.useWideViewPort = true // 关键点
        webSettings.builtInZoomControls = true // 设置缩放
        webSettings.loadWithOverviewMode = true // 全屏
        webSettings.setSupportZoom(true)
        webSettings.displayZoomControls = false
        webSettings.setAppCacheEnabled(true)
        webSettings.layoutAlgorithm = WebSettings.LayoutAlgorithm.SINGLE_COLUMN
        web_view.isDrawingCacheEnabled = true
        web_view.settings.blockNetworkImage = true
        web_view.webViewClient = webViewClient
        web_view.requestFocus(View.FOCUS_DOWN)
        web_view.settings.defaultTextEncodingName = "UTF-8"
        web_view.webChromeClient = webChromeClient
        web_view.loadUrl(mUrl)
    }
}