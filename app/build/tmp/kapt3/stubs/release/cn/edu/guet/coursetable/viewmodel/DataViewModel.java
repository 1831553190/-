package cn.edu.guet.coursetable.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0013J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016\u00a8\u0006&"}, d2 = {"Lcn/edu/guet/coursetable/viewmodel/DataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "apiInterface", "Lcn/edu/guet/coursetable/api/ApiInterface;", "kotlin.jvm.PlatformType", "getApiInterface", "()Lcn/edu/guet/coursetable/api/ApiInterface;", "appdb", "Lcn/edu/guet/coursetable/database/AppDatabase;", "getAppdb", "()Lcn/edu/guet/coursetable/database/AppDatabase;", "bitmapData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getBitmapData", "()Landroidx/lifecycle/MutableLiveData;", "errmsg", "getErrmsg", "listSchedule", "", "Lcom/zhuangfei/timetable/model/ScheduleEnable;", "getListSchedule", "loadVerifyCode", "", "login", "username", "password", "ckcode", "loginErrMsg", "loginObs", "verifyCode", "app_release"})
public final class DataViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> bitmapData = null;
    private final cn.edu.guet.coursetable.api.ApiInterface apiInterface = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zhuangfei.timetable.model.ScheduleEnable>> listSchedule = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errmsg = null;
    @org.jetbrains.annotations.NotNull()
    private final cn.edu.guet.coursetable.database.AppDatabase appdb = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "DataViewModel";
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getBitmapData() {
        return null;
    }
    
    public final cn.edu.guet.coursetable.api.ApiInterface getApiInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zhuangfei.timetable.model.ScheduleEnable>> getListSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrmsg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.database.AppDatabase getAppdb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zhuangfei.timetable.model.ScheduleEnable>> loginObs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> loginErrMsg() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String ckcode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> verifyCode() {
        return null;
    }
    
    public final void loadVerifyCode() {
    }
    
    public DataViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}