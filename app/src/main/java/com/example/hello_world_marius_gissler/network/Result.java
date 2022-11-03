package com.example.hello_world_marius_gissler.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("departureList") // Name des Objekts innerhalb der Daten
    private List<Departure> departureList;

    public List<Departure> getDepartureList() {
        return departureList;
    }

    public void setDepartureList(List<Departure> departureList) {
        this.departureList = departureList;
    }
}
