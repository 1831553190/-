package cn.edu.guet.coursetable.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public final class CookieCache implements CookieJar
{
    private final Map<String, Map<String, Cookie>> cache = new HashMap<>();


    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies)
    {
        if (cache.get(url.host())==null){
            Map<String, Cookie> datas=new HashMap<>();
            for (Cookie cookie:cookies){
                datas.put(cookie.name(),cookie);
            }
            cache.put(url.host(),datas);
        }else{
            for (Cookie cookie:cookies){
                cache.get(url.host()).put(cookie.name(),cookie);
            }
        }

    }


    @Override
    public List<Cookie> loadForRequest(HttpUrl url)
    {
        Map<String, Cookie> result = cache.get(url.host());
        return result == null ? new ArrayList<Cookie>() : new ArrayList<>(result.values());
    }

}
