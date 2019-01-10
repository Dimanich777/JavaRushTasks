package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
         FileInputStream fis = new FileInputStream(s);

        int min = Integer.MIN_VALUE;

        while (fis.available()>0){
            int i = fis.read();

            if (i<min)
            {
                min= i;
            }
        }
            fis.close();
            System.out.println( (byte)min);

    }
}
