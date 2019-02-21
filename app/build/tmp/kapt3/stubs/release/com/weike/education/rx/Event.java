package com.weike.education.rx;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/28
 * * desc: 事件
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/weike/education/rx/Event;", "", "()V", "CategorSelectItem", "ChooseLeftSelectItem", "DiscoveryCommentEvent", "app_release"})
public final class Event {
    
    public Event() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/weike/education/rx/Event$DiscoveryCommentEvent;", "", "()V", "number", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getNumber", "()Ljava/util/ArrayList;", "setNumber", "(Ljava/util/ArrayList;)V", "app_release"})
    public static final class DiscoveryCommentEvent {
        @org.jetbrains.annotations.Nullable()
        private java.util.ArrayList<java.lang.Integer> number;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.Integer> getNumber() {
            return null;
        }
        
        public final void setNumber(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        public DiscoveryCommentEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/weike/education/rx/Event$ChooseLeftSelectItem;", "", "()V", "number", "", "getNumber", "()Ljava/lang/Integer;", "setNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_release"})
    public static final class ChooseLeftSelectItem {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer number;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNumber() {
            return null;
        }
        
        public final void setNumber(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public ChooseLeftSelectItem() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/weike/education/rx/Event$CategorSelectItem;", "", "()V", "position", "", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_release"})
    public static final class CategorSelectItem {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer position;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPosition() {
            return null;
        }
        
        public final void setPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public CategorSelectItem() {
            super();
        }
    }
}