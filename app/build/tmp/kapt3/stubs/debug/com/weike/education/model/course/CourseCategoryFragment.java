package com.weike.education.model.course;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/30
 * * desc: 全部课程
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/weike/education/model/course/CourseCategoryFragment;", "Lcom/weike/education/base/BaseRefreshFragment;", "Lcom/weike/education/mvp/presenter/course/CourseCategoryPresenter;", "Lcom/weike/education/bean/course/VideoBean;", "Lcom/weike/education/mvp/contract/course/CourseCategoryContract$View;", "()V", "mAdapter", "Lcom/weike/education/adapter/course/CourseCategoryAdapter;", "mVideoList", "Ljava/util/ArrayList;", "Lcom/weike/education/bean/course/VideoBean$Data$Video;", "finishTask", "", "getLayoutId", "", "initInject", "initPresenter", "initRecyclerView", "lazyLoadData", "showVideo", "videoBean", "Companion", "app_debug"})
public final class CourseCategoryFragment extends com.weike.education.base.BaseRefreshFragment<com.weike.education.mvp.presenter.course.CourseCategoryPresenter, com.weike.education.bean.course.VideoBean> implements com.weike.education.mvp.contract.course.CourseCategoryContract.View {
    private java.util.ArrayList<com.weike.education.bean.course.VideoBean.Data.Video> mVideoList;
    private com.weike.education.adapter.course.CourseCategoryAdapter mAdapter;
    public static final com.weike.education.model.course.CourseCategoryFragment.Companion Companion = null;
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
    public void showVideo(@org.jetbrains.annotations.NotNull()
    com.weike.education.bean.course.VideoBean videoBean) {
    }
    
    @java.lang.Override()
    protected void finishTask() {
    }
    
    public CourseCategoryFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/weike/education/model/course/CourseCategoryFragment$Companion;", "", "()V", "newInstance", "Lcom/weike/education/model/course/CourseCategoryFragment;", "id", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.weike.education.model.course.CourseCategoryFragment newInstance(int id) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}