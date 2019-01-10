package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String value = reader.readLine();
            if(value.equals("exit")) break;
            try {
                if(value.matches("\\-?\\d+\\.\\d+")) print(Double.parseDouble(value));
                else if(value.matches("\\-?\\d+")) {
                    if(Integer.parseInt(value) > 0 &&  Integer.parseInt(value) < 128)
                        print(Short.parseShort(value));
                    else if(Integer.parseInt(value) <= 0 ||  Integer.parseInt(value) >= 128)
                        print(Integer.parseInt(value));
                }
                else print(value);
            }
            catch(NumberFormatException e) {
                print(value);
            }
        }



        }





    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
