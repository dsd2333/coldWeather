package com.example.coldweather.gson;

/**
 * Created by 杜松阳 on 2018/11/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
