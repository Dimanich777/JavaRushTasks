package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(3.353,"edfsd");
        labels.put(3.3,"edfsd");
        labels.put(3.35,"edfsd");
        labels.put(3.353545,"edfsd");
        labels.put(3.35545454543,"edfsd");


    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
