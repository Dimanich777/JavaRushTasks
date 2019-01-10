package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> map= new HashMap<>();
        for (int i=0; i<10; i++){
            map.put("last"+i,"first");
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> secondCopy = new HashMap<String, String>(map);
        for(Map.Entry<String, String> pair: copy.entrySet()){
            String value = pair.getValue();
            String key = pair.getKey();
            secondCopy.remove(key);
            if (secondCopy.containsValue(value)) removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
