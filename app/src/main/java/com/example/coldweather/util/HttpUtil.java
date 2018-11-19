package com.example.coldweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 杜松阳 on 2018/11/19.
 * 借用OkHttp出色的封装，在这里我们只需要三行代码来完成与服务器的交互操作。
 * 在这里我们想要发起一条HTTP请求，只需要调用sendOkHttpRequest()方法，传入请求地址，并注册一个回调来
 * 处理服务器响应即可。
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
