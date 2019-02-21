package com.weike.education.model.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/28
 * * desc: 选择阶段
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J$\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0006`\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/weike/education/model/app/ChoosePhaseActivity;", "Lcom/weike/education/base/BaseInjectActivity;", "Lcom/weike/education/mvp/presenter/app/ChoosePhasePresenter;", "Lcom/weike/education/mvp/contract/app/ChoosePhaseContract$View;", "()V", "leftId", "", "mAdapter", "Lcom/weike/education/adapter/app/ChoosePhaseAdapter;", "getMAdapter", "()Lcom/weike/education/adapter/app/ChoosePhaseAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mPosition", "mStages", "Lcom/weike/education/bean/app/DiscoveryCommentBean$Data$Stages;", "mTagBean", "Lcom/weike/education/bean/app/TagBean;", "numbers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLayoutId", "initInject", "", "initPresenter", "initTagLayout", "titles", "", "", "tagId", "initWidget", "loadData", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showDiscoveryComment", "mData", "Lcom/weike/education/bean/app/DiscoveryCommentBean;", "switchCategory", "position", "switchRepresent", "switchScreen", "app_release"})
public final class ChoosePhaseActivity extends com.weike.education.base.BaseInjectActivity<com.weike.education.mvp.presenter.app.ChoosePhasePresenter> implements com.weike.education.mvp.contract.app.ChoosePhaseContract.View {
    private com.weike.education.bean.app.DiscoveryCommentBean.Data.Stages mStages;
    private java.util.ArrayList<java.lang.Integer> numbers;
    private com.weike.education.bean.app.TagBean mTagBean;
    private int leftId;
    private int mPosition;
    private final kotlin.Lazy mAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.weike.education.adapter.app.ChoosePhaseAdapter getMAdapter() {
        return null;
    }
    
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
    public void loadData() {
    }
    
    @java.lang.Override()
    public void initWidget() {
    }
    
    @java.lang.Override()
    public void showDiscoveryComment(@org.jetbrains.annotations.NotNull()
    com.weike.education.bean.app.DiscoveryCommentBean mData) {
    }
    
    private final void switchScreen() {
    }
    
    private final void switchRepresent(com.weike.education.bean.app.TagBean mTagBean) {
    }
    
    private final void initTagLayout(java.util.List<java.lang.String> titles, java.util.List<java.lang.Integer> tagId) {
    }
    
    private final void switchCategory(int position) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public ChoosePhaseActivity() {
        super();
    }
}