package cn.edu.guet.coursetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcn/edu/guet/coursetable/MainActivity;", "Lcn/edu/guet/coursetable/ui/BaseActivity;", "()V", "mView", "Lcn/edu/guet/coursetable/databinding/ActivityMainBinding;", "getMView", "()Lcn/edu/guet/coursetable/databinding/ActivityMainBinding;", "setMView", "(Lcn/edu/guet/coursetable/databinding/ActivityMainBinding;)V", "pref", "Landroid/content/SharedPreferences;", "getPref", "()Landroid/content/SharedPreferences;", "setPref", "(Landroid/content/SharedPreferences;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "updateSpinnerText", "week", "", "app_release"})
public final class MainActivity extends cn.edu.guet.coursetable.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.databinding.ActivityMainBinding mView;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences pref;
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.databinding.ActivityMainBinding getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void updateSpinnerText(@org.jetbrains.annotations.NotNull()
    java.lang.String week) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}