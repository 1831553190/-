package cn.edu.guet.coursetable.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u001e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u0012\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\nJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\r\u00a8\u0006)"}, d2 = {"Lcn/edu/guet/coursetable/viewmodel/DataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "account", "Landroidx/lifecycle/MutableLiveData;", "Lcn/edu/guet/coursetable/model/Account;", "getAccount", "()Landroidx/lifecycle/MutableLiveData;", "apiInterface", "Lcn/edu/guet/coursetable/api/ApiInterface;", "kotlin.jvm.PlatformType", "getApiInterface", "()Lcn/edu/guet/coursetable/api/ApiInterface;", "appdb", "Lcn/edu/guet/coursetable/database/AppDatabase;", "getAppdb", "()Lcn/edu/guet/coursetable/database/AppDatabase;", "bitmapData", "Landroid/graphics/Bitmap;", "getBitmapData", "errmsg", "getErrmsg", "listSchedule", "", "Lcom/zhuangfei/timetable/model/ScheduleEnable;", "getListSchedule", "loadVerifyCode", "", "login", "username", "password", "ckcode", "loginErrMsg", "loginObs", "verifyCode", "app_debug"})
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
    private final androidx.lifecycle.MutableLiveData<cn.edu.guet.coursetable.model.Account> account = null;
    
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
    public final androidx.lifecycle.MutableLiveData<cn.edu.guet.coursetable.model.Account> getAccount() {
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
    
    /**
     * login：登录操作
     * 先登录，登录成功后，同步获取学期信息以及个人信息
     * 获取成功后再通过学期信息获取当前学期的课表，不获取所有学期的信息
     *
     * flow ： 数据流，和RxJava类似的操作
     */
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