package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //这里应该要改
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
