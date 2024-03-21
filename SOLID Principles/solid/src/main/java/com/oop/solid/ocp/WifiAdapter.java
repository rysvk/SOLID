package com.oop.solid.ocp;

import java.util.UUID;

public class WifiAdapter{
    private boolean isConnected;

    public WifiAdapter(){
        isConnected=false;
    }

    public void connect(){
        isConnected = true;
    }

    public int getLiveChannelCount(){
        return isConnected ? 100:0;
    }

    public boolean isConnectedtoWifi(){
        return isConnected;
    }

    public String getRandomChannel(){
        return UUID.randomUUID().toString();
    }
}