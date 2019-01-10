package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int mas1[] = new int[5];
        int mas2[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            mas1[i] = scanner.nextInt();
            mas1[i] = mas2[i];
        }
        Arrays.sort(mas2);
        for (int i = 0; i < 5; i++) {
            if (mas2[i] < 0) {
                System.out.println(mas2[i]);
            }


        }
    }
}
