package com.oop.solid.dip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private Map<String,String> kvs;
    public DataStore(){
        kvs = new HashMap<>();
    }
    public boolean hasKey(String key){
        return kvs.containsKey(key);
    }
    public String getValue(String key){
        if(kvs.containsKey(key))
            return kvs.get(key);
        return null;
    }
    public void putValue(String key, String value){
        kvs.put(key, value);
    }
    public void removeKey(String key){
        kvs.remove(key);
    }
    public List<String> getKeys(){
        return new ArrayList<>(kvs.keySet());
    }
}
