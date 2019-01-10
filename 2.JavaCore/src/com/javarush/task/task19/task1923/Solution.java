package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileName2));
        Pattern pattern = Pattern.compile("\\d");
        String line;
        while ((line = fReader.readLine()) != null) {
            String[] splitted = line.split(" ");
            for (String s : splitted) {
                if (pattern.matcher(s).find()) {
                    fWriter.write(s + " ");
                }
            }
        }
        fReader.close();
        fWriter.close();
    }
}