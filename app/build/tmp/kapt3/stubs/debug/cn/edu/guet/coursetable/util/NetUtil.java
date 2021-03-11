package cn.edu.guet.coursetable.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcn/edu/guet/coursetable/util/NetUtil;", "", "()V", "Companion", "app_debug"})
public final class NetUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseUrl = "http://172.16.13.22/";
    private static retrofit2.Retrofit instance;
    public static final cn.edu.guet.coursetable.util.NetUtil.Companion Companion = null;
    
    public NetUtil() {
        super();
    }
    
    /**
     * 网络工具类，主要用于初始化Retrofit
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcn/edu/guet/coursetable/util/NetUtil$Companion;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "instance", "Lretrofit2/Retrofit;", "getRetrofit", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBaseUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}