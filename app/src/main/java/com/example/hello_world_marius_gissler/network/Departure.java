package com.example.hello_world_marius_gissler.network;

import com.google.gson.annotations.SerializedName;

public class Departure {

    @SerializedName("servingLine")
    private ServingLine servingLine;

    public ServingLine getServingLine() {
        return servingLine;
    }

    public void setServingLine(ServingLine servingLine) {
        this.servingLine = servingLine;
    }
    @SerializedName("dateTime")
    private DateTime dateTime;

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

}
