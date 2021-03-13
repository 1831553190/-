package cn.edu.guet.coursetable.api

import cn.edu.guet.coursetable.model.*
import com.google.gson.JsonElement
import okhttp3.ResponseBody
import retrofit2.http.*
import java.util.*


/**
 * 网络操作的相关接口都在这
 */
interface ApiInterface {

    @POST("Login/SubmitLogin")
    suspend fun login(@Body body:HashMap<String,String>): JsonElement

    @GET("login/GetValidateCode")
    suspend fun getVerifyCode(): ResponseBody


    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("student/getstutable")
    suspend fun getCourseTable(@QueryMap body: HashMap<String, String>): Msg<List<Course>>

    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("student/getlabtable")
    suspend fun getLabTable(@QueryMap body: HashMap<String, String>): Msg<List<Experimental>>

    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @POST("Student/GetPerson")
    suspend fun getPersonInfo(): Msg<Account>

    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("Comm/GetTerm")
    suspend fun getTermInfo(@QueryMap body: HashMap<String, String>): Msg<List<TermInfo>>


    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("student/getexamap")
    suspend fun getExams(@QueryMap body: HashMap<String, String>): Msg<List<ExamData>>
//
//    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
//    @GET("Student/GetStuScore")
//    suspend fun getScores(@QueryMap body: HashMap<String?, String?>?): Msg<List<Score>>

    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("Student/GetStuScore")
    suspend fun getScoresCal(@QueryMap body: HashMap<String, String>): ResponseBody


    /**
     * 获取选课信息
     */
    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("student/GetPlan")
    suspend fun getPlan(@QueryMap body: HashMap<String, String>):Msg<List<CoursePlan>>

    /**
     * 获取选课信息
     */
    @Headers("Referer:http://172.16.13.22/Login/MainDesktop")
    @GET("student/GetPlan")
    suspend fun getPlanDetail(@QueryMap body: HashMap<String, String>):CoursePlan



}