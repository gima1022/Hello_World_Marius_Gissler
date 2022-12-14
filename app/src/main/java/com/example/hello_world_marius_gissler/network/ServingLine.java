package com.example.hello_world_marius_gissler.network;

import com.google.gson.annotations.SerializedName;

public class ServingLine {

    @SerializedName("number")
    private String number;

    @SerializedName("name")
    private String name;

    @SerializedName("direction")
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String destination) {
        this.direction = destination;
    }

    public String getNumber() {
        return number;
    }

    //getter+ setter funktionen über rechtsklick generate getter+setter

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
