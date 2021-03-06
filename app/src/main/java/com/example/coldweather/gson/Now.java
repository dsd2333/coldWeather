package com.example.coldweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 杜松阳 on 2018/11/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
