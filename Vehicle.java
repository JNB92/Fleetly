package com.example.fleetmanagement;

import java.io.Serializable;

public class Vehicle implements Serializable { // Implement Serializable here
    private String name;
    private String type;
    private String number;
    private String source;
    private String destination;
    private String currentLocation;
    private String goodsTemperature;
    private String fuelStatus;

    public Vehicle(String name, String type, String number, String source, String destination, String currentLocation,
                   String goodsTemperature, String fuelStatus) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.currentLocation = currentLocation;
        this.goodsTemperature = goodsTemperature;
        this.fuelStatus = fuelStatus;


    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getNumber(){return number;}
    public void setNumber(String number){this.number = number;}
    public String getSource(){return source;}
    public void setSource(String source){this.source = source;}
    public String getDestination(){return destination;}
    public void setDestination(String destination){this.destination = destination;}
    public String getCurrentLocation(){return currentLocation;}
    public void setCurrentLocation(String currentLocation){this.currentLocation = currentLocation;}
    public String getGoodsTemperature(){return goodsTemperature;}
    public void setGoodsTemperature(String goodsTemperature){this.goodsTemperature = goodsTemperature;}
    public String getFuelStatus(){return fuelStatus;}
    public void setFuelStatus(String fuelStatus){this.fuelStatus = fuelStatus;}

}
