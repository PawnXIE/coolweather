package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//和风api地址
//http://guolin.tech/api/weather?cityid=CN101190401&key=bc0418b57b2d4918819d3974ac1285d9

public class MainActivity extends AppCompatActivity {

    //test code
    /*String[] aaa = {"1","2","3"};
    int x = aaa.length;
    int y =(int) Math.random()*x;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather",null) != null) {
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
