package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String min = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length()<min.length()){
                min=strings.get(i);
            }
           /* else {
                min=strings.get(0);}*/
        }
        for (int j=0; j<5; j++){
            if(strings.get(j).length()==min.length()){
                System.out.println(strings.get(j));
            }


        }


    }
}


