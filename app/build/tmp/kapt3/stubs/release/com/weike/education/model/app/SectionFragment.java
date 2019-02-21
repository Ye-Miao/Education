package com.weike.education.model.app;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/19
 * * desc: 精选界面
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00020\u000f`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0007j\b\u0012\u0004\u0012\u00020\u0011`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0007j\b\u0012\u0004\u0012\u00020\u0013`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/weike/education/model/app/SectionFragment;", "Lcom/weike/education/base/BaseRefreshFragment;", "Lcom/weike/education/mvp/presenter/app/SelectionPresenter;", "Lcom/weike/education/bean/app/SelectionBean;", "Lcom/weike/education/mvp/contract/app/SelectionContract$View;", "()V", "mCourseList", "Ljava/util/ArrayList;", "Lcom/weike/education/bean/app/SelectionBean$Data$Course;", "Lkotlin/collections/ArrayList;", "mHeaderList", "Lcom/weike/education/bean/app/SelectionBean$Data$Head;", "mSectionedAdapter", "Lcom/weike/education/widget/section/SectionedRVAdapter;", "mSerialList", "Lcom/weike/education/bean/app/SelectionBean$Data$Serial;", "mSpecialList", "Lcom/weike/education/bean/app/SelectionBean$Data$Zhuanlan;", "mVideoList", "Lcom/weike/education/bean/app/SelectionBean$Data$Video;", "clear", "", "finishTask", "getLayoutId", "", "initInject", "initPresenter", "initRecyclerView", "lazyLoadData", "showSelection", "selectionBean", "Companion", "app_release"})
public final class SectionFragment extends com.weike.education.base.BaseRefreshFragment<com.weike.education.mvp.presenter.app.SelectionPresenter, com.weike.education.bean.app.SelectionBean> implements com.weike.education.mvp.contract.app.SelectionContract.View {
    private final java.util.ArrayList<com.weike.education.bean.app.SelectionBean.Data.Head> mHeaderList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.SelectionBean.Data.Zhuanlan> mSpecialList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.SelectionBean.Data.Serial> mSerialList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.SelectionBean.Data.Video> mVideoList = null;
    private final java.util.ArrayList<com.weike.education.bean.app.SelectionBean.Data.Course> mCourseList = null;
    private com.weike.education.widget.section.SectionedRVAdapter mSectionedAdapter;
    public static final com.weike.education.model.app.SectionFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initPresenter() {
    }
    
    @java.lang.Override()
    protected void initInject() {
    }
    
    @java.lang.Override()
    protected void lazyLoadData() {
    }
    
    @java.lang.Override()
    protected void initRecyclerView() {
    }
    
    @java.lang.Override()
    protected void clear() {
    }
    
    @java.lang.Override()
    public void showSelection(@org.jetbrains.annotations.NotNull()
    com.weike.education.bean.app.SelectionBean selectionBean) {
    }
    
    @java.lang.Override()
    protected void finishTask() {
    }
    
    public SectionFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/weike/education/model/app/SectionFragment$Companion;", "", "()V", "newInstance", "Lcom/weike/education/model/app/SectionFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.weike.education.model.app.SectionFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}