package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String file1= reader.readLine();
         String file2 = reader.readLine();

         reader.close();

        BufferedReader filereader = new BufferedReader(new FileReader(file1));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(file2));
        String line;
        while ((line = filereader.readLine()) != null) {
            filewriter.write(line.replaceAll("[\\p{P}]", ""));
            filewriter.newLine();
        }

        filereader.close();
        filewriter.close();
    }
}

