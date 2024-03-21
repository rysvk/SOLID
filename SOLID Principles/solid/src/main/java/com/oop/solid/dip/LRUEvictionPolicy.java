package com.oop.solid.dip;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUEvictionPolicy {
    private LinkedList<String> orderedKeys;
    private Set<String> keySet;
    int capacity;
    public LRUEvictionPolicy(int capacity){
        orderedKeys= new LinkedList<>();
        keySet = new HashSet<>();
        this.capacity= capacity;
    }
    public void updateGetKey(String key){
        if(!keySet.contains(key))
            return;
        int index = orderedKeys.indexOf(key);
        orderedKeys.remove(index);
        orderedKeys.add(0, key);
    }
    public boolean shouldEvict(String key){
        if(keySet.size()==capacity && !keySet.contains(key))
            return true;
        return false;
    }
    public String getEvictedKey(String key){
        if(shouldEvict(key))
            return orderedKeys.getLast();
        return null;
    }
    public void updatePutKey(String key){
        boolean eviction = shouldEvict(key);
        if(eviction){
            String evictedKey = getEvictedKey(key);
            keySet.remove(evictedKey);
            orderedKeys.removeLast();
        }
        if(keySet.contains(key)){
            orderedKeys.remove(orderedKeys.indexOf(key));
        }
        orderedKeys.add(0, key);
        keySet.add(key);
    }
}
