package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++){
            list.add(reader.readLine());
        }
        int min=list.get(0).length();
        int minL=0;
        int max= list.get(0).length();
        int maxL=0;

        for (int i=1; i<list.size(); i++){
            if(list.get(i).length()<min){
                min=list.get(i).length();
                minL=i;
            }
            if(list.get(i).length()>max){
                max=list.get(i).length();
                maxL=i;
            }
        }
        if (minL<maxL){
            System.out.println(list.get(minL));
        }
        else {
            System.out.println(list.get(maxL));
        }


    }
}
