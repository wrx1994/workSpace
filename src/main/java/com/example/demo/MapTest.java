package com.example.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

    public static void main(String[] args) {
        String a = "q";
        System.out.println(a.hashCode());
        Map map = new ConcurrentHashMap(32,0.75f,32);
        map.put("q","");
    }

}
