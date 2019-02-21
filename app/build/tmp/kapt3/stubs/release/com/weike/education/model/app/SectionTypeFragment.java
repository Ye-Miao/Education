package com.weike.education.model.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/20
 * * desc: 标签界面
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00020\u000f`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/weike/education/model/app/SectionTypeFragment;", "Lcom/weike/education/base/BaseRefreshFragment;", "Lcom/weike/education/mvp/presenter/app/SelectionTypePresenter;", "Lcom/weike/education/bean/app/VerticalBean;", "Lcom/weike/education/mvp/contract/app/SelectionTypeContract$View;", "()V", "mColumnList", "Ljava/util/ArrayList;", "Lcom/weike/education/bean/app/VerticalBean$Data$Column;", "Lkotlin/collections/ArrayList;", "mHeaderList", "Lcom/weike/education/bean/app/VerticalBean$Data$Banner;", "mSectionedAdapter", "Lcom/weike/education/widget/section/SectionedRVAdapter;", "mSubTagList", "Lcom/weike/education/bean/app/VerticalBean$Data$SubTag;", "mTid", "", "clear", "", "finishTask", "getLayoutId", "initInject", "initPresenter", "initRecyclerView", "initVariables", "lazyLoadData", "showVertical", "verticalBean", "Companion", "app_release"})
public final class SectionTypeFragment extends com.weike.education.base.BaseRefreshFragment<com.weike.education.mvp.presenter.app.SelectionTypePresenter, com.weike.education.bean.app.VerticalBean> implements com.weike.education.mvp.contract.app.SelectionTypeContract.View {
    private int mTid;
    private final java.util.ArrayList<com.weike.education.bean.app.VerticalBean.Data.Banner> mHeaderList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.VerticalBean.Data.SubTag> mSubTagList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.VerticalBean.Data.Column> mColumnList = null;
    private com.weike.education.widget.section.SectionedRVAdapter mSectionedAdapter;
    public static final com.weike.education.model.app.SectionTypeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void initVariables() {
    }
    
    @java.lang.Override()
    protected void initInject() {
    }
    
    @java.lang.Override()
    protected void initPresenter() {
    }
    
    @java.lang.Override()
    protected void lazyLoadData() {
    }
    
    @java.lang.Override()
    protected void clear() {
    }
    
    @java.lang.Override()
    protected void initRecyclerView() {
    }
    
    @java.lang.Override()
    public void showVertical(@org.jetbrains.annotations.NotNull()
    com.weike.education.bean.app.VerticalBean verticalBean) {
    }
    
    @java.lang.Override()
    protected void finishTask() {
    }
    
    public SectionTypeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/weike/education/model/app/SectionTypeFragment$Companion;", "", "()V", "newInstance", "Lcom/weike/education/model/app/SectionTypeFragment;", "tid", "", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.weike.education.model.app.SectionTypeFragment newInstance(int tid) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}