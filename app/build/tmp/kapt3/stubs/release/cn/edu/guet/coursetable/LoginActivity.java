package cn.edu.guet.coursetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lcn/edu/guet/coursetable/LoginActivity;", "Lcn/edu/guet/coursetable/ui/BaseActivity;", "()V", "dataViewModel", "Lcn/edu/guet/coursetable/viewmodel/DataViewModel;", "getDataViewModel", "()Lcn/edu/guet/coursetable/viewmodel/DataViewModel;", "dataViewModel$delegate", "Lkotlin/Lazy;", "mView", "Lcn/edu/guet/coursetable/databinding/LayoutLoginBinding;", "getMView", "()Lcn/edu/guet/coursetable/databinding/LayoutLoginBinding;", "setMView", "(Lcn/edu/guet/coursetable/databinding/LayoutLoginBinding;)V", "preference", "Landroid/content/SharedPreferences;", "getPreference", "()Landroid/content/SharedPreferences;", "setPreference", "(Landroid/content/SharedPreferences;)V", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "initObserver", "", "loginSuccess", "list", "", "Lcom/zhuangfei/timetable/model/ScheduleEnable;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class LoginActivity extends cn.edu.guet.coursetable.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.databinding.LayoutLoginBinding mView;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences preference;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dataViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public android.app.ProgressDialog progressDialog;
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.databinding.LayoutLoginBinding getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.databinding.LayoutLoginBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreference() {
        return null;
    }
    
    public final void setPreference(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.viewmodel.DataViewModel getDataViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    android.app.ProgressDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initObserver() {
    }
    
    public final void loginSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zhuangfei.timetable.model.ScheduleEnable> list) {
    }
    
    public LoginActivity() {
        super();
    }
}