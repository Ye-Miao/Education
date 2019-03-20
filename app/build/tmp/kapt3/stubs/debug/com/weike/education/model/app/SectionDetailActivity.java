package com.weike.education.model.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2019/1/5
 * * desc:
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0003J\b\u0010\r\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/weike/education/model/app/SectionDetailActivity;", "Lcom/weike/education/base/BaseInjectActivity;", "Lcom/weike/education/mvp/presenter/app/SectionDetailPresenter;", "Lcom/weike/education/mvp/contract/app/SectionDetailContract$View;", "()V", "mUrl", "", "getLayoutId", "", "initInject", "", "initPresenter", "initWebView", "initWidget", "WebClient", "WebClientBase", "app_debug"})
public final class SectionDetailActivity extends com.weike.education.base.BaseInjectActivity<com.weike.education.mvp.presenter.app.SectionDetailPresenter> implements com.weike.education.mvp.contract.app.SectionDetailContract.View {
    private java.lang.String mUrl;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void initInject() {
    }
    
    @java.lang.Override()
    public void initPresenter() {
    }
    
    @java.lang.Override()
    public void initWidget() {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final void initWebView() {
    }
    
    public SectionDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/weike/education/model/app/SectionDetailActivity$WebClientBase;", "Landroid/webkit/WebViewClient;", "(Lcom/weike/education/model/app/SectionDetailActivity;)V", "onPageFinished", "", "webView", "Landroid/webkit/WebView;", "s", "", "onReceivedHttpError", "view", "request", "Landroid/webkit/WebResourceRequest;", "errorResponse", "Landroid/webkit/WebResourceResponse;", "app_debug"})
    public final class WebClientBase extends android.webkit.WebViewClient {
        
        @java.lang.Override()
        public void onPageFinished(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView webView, @org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onReceivedHttpError(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceRequest request, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceResponse errorResponse) {
        }
        
        public WebClientBase() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/model/app/SectionDetailActivity$WebClient;", "Landroid/webkit/WebChromeClient;", "(Lcom/weike/education/model/app/SectionDetailActivity;)V", "onProgressChanged", "", "webView", "Landroid/webkit/WebView;", "i", "", "app_debug"})
    public final class WebClient extends android.webkit.WebChromeClient {
        
        @java.lang.Override()
        public void onProgressChanged(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView webView, int i) {
        }
        
        public WebClient() {
            super();
        }
    }
}