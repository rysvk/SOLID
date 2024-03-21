package com.oop.solid.ocp;

public class Television {
    public WifiAdapter wifiAdapter;

    public Television(){
        wifiAdapter = new WifiAdapter();
    }
    public String getModel(){
        return "Samsung NGH220";
    }

    public int getChannelCount(){
        return 100;
    }

    public String getChannelatPos(int pos){
        return "Channel "+Integer.valueOf(pos).toString();
    }

    public int getOnlinechannelCount(){
        return wifiAdapter.getLiveChannelCount();
    }

    public boolean connectToWifi(){
        wifiAdapter.connect();
        return wifiAdapter.isConnectedtoWifi();
    }

}
