package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s  = null;
        FileInputStream fis = null;
            while (true){
                try {
                    s =reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fis = new FileInputStream(s);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                if (fis.available()<1000){
                    reader.close();
                    fis.close();
                    throw new DownloadException();
                }

            }
    }

    public static class DownloadException extends Exception {

    }
}
