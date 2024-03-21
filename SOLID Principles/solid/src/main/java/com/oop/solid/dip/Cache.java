package com.oop.solid.dip;

import java.util.List;

public class Cache {
    private DataStore dataStore;
    private LRUEvictionPolicy evictionPolicy;
    private int capacity;
    public Cache(int cap){
        capacity = cap;
        dataStore = new DataStore();
        evictionPolicy = new LRUEvictionPolicy(capacity);
    }
    public String get(String key){
        boolean isKeyPresent = dataStore.hasKey(key);
        if(!isKeyPresent)
            return null;
        evictionPolicy.updateGetKey(key);
        return dataStore.getValue(key);
    }
    public void put(String key, String value){
        if(evictionPolicy.shouldEvict(key))
            dataStore.removeKey(evictionPolicy.getEvictedKey(key));
        evictionPolicy.updatePutKey(key);
        dataStore.putValue(key,value);
    }
    public List<String> getKeys(){
        return dataStore.getKeys();
    }
}
