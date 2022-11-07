package com.example.hello_world_marius_gissler.network;

import com.google.gson.annotations.SerializedName;

public class DateTime {


    @SerializedName("hour")
    private String hour;

    @SerializedName("minute")
    private String minute;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}

