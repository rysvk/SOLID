package com.oop.solid.dip;

public class CacheDemo {
    public static void main(String args[]){
        Cache cache = new Cache(2);
        cache.put("Arpit", "Asli Engineering");
        cache.put("Gaurav", "GKCS");
        System.out.println(cache.get("Arpit"));
        cache.put("Jordanhasnolife", "Xoogler");
        System.out.println(cache.getKeys());
        cache.put("Narendra", "Dummy");
        System.out.println(cache.getKeys());
        cache.put("Gergely", "Newsletter");
        System.out.println(cache.getKeys());
    }
}
