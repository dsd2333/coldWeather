package com.example.coldweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 杜松阳 on 2018/11/19.
 * 由于JSON中一些字段不适合直接作为JAVA字段来命名，因此在这里使用@SerializedName注解的方式来让JSON字段和
 * JAVA字段之间建立映射关系。
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
