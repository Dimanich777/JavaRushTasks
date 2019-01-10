package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i++<10;map.put("lastname"+i,i*100));
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> mapCopy=new HashMap<>(map);
        for(HashMap.Entry<String,Integer> pair : mapCopy.entrySet())if((pair.getValue()<500))map.remove(pair.getKey());
    }

    public static void main(String[] args) {

    }
}