package com.example.coldweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 杜松阳 on 2018/11/19.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
