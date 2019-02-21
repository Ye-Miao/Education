package com.weike.education;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/7
 * * desc: App主入口
 * * * #                                                   #
 * * * #                       _oo0oo_                     #
 * * * #                      o8888888o                    #
 * * * #                      88" . "88                    #
 * * * #                      (| -_- |)                    #
 * * * #                      0\  =  /0                    #
 * * * #                    ___/`---'\___                  #
 * * * #                  .' \\|     |# '.                 #
 * * * #                 / \\|||  :  |||# \                #
 * * * #                / _||||| -:- |||||- \              #
 * * * #               |   | \\\  -  #/ |   |              #
 * * * #               | \_|  ''\---/''  |_/ |             #
 * * * #               \  .-\__  '-'  ___/-. /             #
 * * * #             ___'. .'  /--.--\  `. .'___           #
 * * * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * * * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * * * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * * * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * * * #                       `=---='                     #
 * * * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * * * #                                                   #
 * * * #               佛祖保佑         永无BUG             #
 * * * #                                                   #
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/weike/education/App;", "Landroid/app/Application;", "()V", "allActivities", "Ljava/util/HashSet;", "Landroid/app/Activity;", "Lkotlin/collections/HashSet;", "mApiComponent", "Lcom/weike/education/di/component/ApiComponent;", "getMApiComponent", "()Lcom/weike/education/di/component/ApiComponent;", "mApiComponent$delegate", "Lkotlin/Lazy;", "addActivity", "", "act", "exitApp", "initCrashHandler", "initLog", "initNetwork", "onCreate", "removeActivity", "Companion", "app_debug"})
public final class App extends android.app.Application {
    private java.util.HashSet<android.app.Activity> allActivities;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mApiComponent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static com.weike.education.App instance;
    public static final com.weike.education.App.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.weike.education.di.component.ApiComponent getMApiComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initNetwork() {
    }
    
    private final void initCrashHandler() {
    }
    
    private final void initLog() {
    }
    
    /**
     * * 增加Activity
     *     * @param act act
     */
    public final void addActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity act) {
    }
    
    /**
     * * 移除Activity
     *     * @param act act
     */
    public final void removeActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity act) {
    }
    
    public final synchronized void exitApp() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/App$Companion;", "", "()V", "instance", "Lcom/weike/education/App;", "getInstance", "()Lcom/weike/education/App;", "setInstance", "(Lcom/weike/education/App;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.weike.education.App getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.weike.education.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}