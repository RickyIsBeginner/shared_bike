package com.uestc.ricky.sharedbike.domain;

public class Station {
    private int stationId;
    private String name;
    private float lng;
    private float lat;
    private int dockCount;

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public int getDockCount() {
        return dockCount;
    }

    public void setDockCount(int dockCount) {
        this.dockCount = dockCount;
    }
}
