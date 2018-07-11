package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    //此处变量名需与天气json数据的名字对应，比如Basic的变量名一开始使用的mBasic，是解析不到数据的

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}
