package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String z = s.toUpperCase();
        System.out.print(z.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)==' ') System.out.print(z.charAt(i));
            else System.out.print(s.charAt(i));
        }
    }
}
