package cn.edu.guet.coursetable.util

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetUtil {

    /**
     * 网络工具类，主要用于初始化Retrofit
     */
    companion object{
        val baseUrl="http://172.16.13.22/"
        private var instance:Retrofit?=null

        fun getRetrofit():Retrofit{

            return instance?: synchronized(this){
                val ret=Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(OkHttpClient.Builder()
                        .cookieJar(CookieCache())
                        .build())
                    .build();
                instance=ret;
                ret
            }
        }
    }
}