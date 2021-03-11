package cn.edu.guet.coursetable.viewmodel;

import java.lang.System;

/**
 * DBViewModel ：主要是从数据库中查询个人信息并返回
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\nJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcn/edu/guet/coursetable/viewmodel/DBViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "account", "Landroidx/lifecycle/MutableLiveData;", "Lcn/edu/guet/coursetable/model/Account;", "getAccount", "()Landroidx/lifecycle/MutableLiveData;", "appdb", "Lcn/edu/guet/coursetable/database/AppDatabase;", "courses", "", "Lcom/zhuangfei/timetable/model/ScheduleEnable;", "curWek", "", "courseTableObserver", "currentWeekObserver", "loadCourseTables", "", "app_debug"})
public final class DBViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "DBViewModel";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.zhuangfei.timetable.model.ScheduleEnable>> courses = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> curWek = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<cn.edu.guet.coursetable.model.Account> account = null;
    private final cn.edu.guet.coursetable.database.AppDatabase appdb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<cn.edu.guet.coursetable.model.Account> getAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zhuangfei.timetable.model.ScheduleEnable>> courseTableObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentWeekObserver() {
        return null;
    }
    
    /**
     * 从数据库加载课程信息
     */
    public final void loadCourseTables() {
    }
    
    public DBViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}