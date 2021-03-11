package cn.edu.guet.coursetable.api;

import java.lang.System;

/**
 * 网络操作的相关接口都在这
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ3\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\u00020\u00122\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ3\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0015\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0016\u001a\u00020\u00172\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcn/edu/guet/coursetable/api/ApiInterface;", "", "getCourseTable", "Lcn/edu/guet/coursetable/model/Msg;", "", "Lcn/edu/guet/coursetable/model/Course;", "body", "Ljava/util/HashMap;", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExams", "Lcn/edu/guet/coursetable/model/ExamData;", "getLabTable", "Lcn/edu/guet/coursetable/model/Experimental;", "getPersonInfo", "Lcn/edu/guet/coursetable/model/Account;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScoresCal", "Lokhttp3/ResponseBody;", "getTermInfo", "Lcn/edu/guet/coursetable/model/TermInfo;", "getVerifyCode", "login", "Lcom/google/gson/JsonElement;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Login/SubmitLogin")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonElement> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "login/GetValidateCode")
    public abstract java.lang.Object getVerifyCode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "student/getstutable")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getCourseTable(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super cn.edu.guet.coursetable.model.Msg<java.util.List<cn.edu.guet.coursetable.model.Course>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "student/getlabtable")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getLabTable(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super cn.edu.guet.coursetable.model.Msg<java.util.List<cn.edu.guet.coursetable.model.Experimental>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Student/GetPerson")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getPersonInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super cn.edu.guet.coursetable.model.Msg<cn.edu.guet.coursetable.model.Account>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Comm/GetTerm")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getTermInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super cn.edu.guet.coursetable.model.Msg<java.util.List<cn.edu.guet.coursetable.model.TermInfo>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "student/getexamap")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getExams(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super cn.edu.guet.coursetable.model.Msg<java.util.List<cn.edu.guet.coursetable.model.ExamData>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Student/GetStuScore")
    @retrofit2.http.Headers(value = {"Referer:http://172.16.13.22/Login/MainDesktop"})
    public abstract java.lang.Object getScoresCal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> p1);
}