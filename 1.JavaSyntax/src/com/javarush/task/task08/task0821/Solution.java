package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Dmitri","Dimanich");
        map.put("Dmitri","Dimanich1");
        map.put("Dmitri1","Dimanich9");
        map.put("Dmitri1","Dimanich8");
        map.put("Dmitri1","Dimanich7");
        map.put("Dmitri1","Dimanich6");
        map.put("Dmitri1","Dimanich5");
        map.put("Dmitri1","Dimanich4");
        map.put("Dmitri1","Dimanich3");
        map.put("Dmitri1","Dimanich2");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
