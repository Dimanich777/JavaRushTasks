package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String f1 = r.readLine();
        String f2 = r.readLine();
        String f3 = r.readLine();
        FileInputStream ins1 = new FileInputStream(f1);
        FileOutputStream out2 = new FileOutputStream(f2);
        FileOutputStream out3 = new FileOutputStream(f3);

        byte[] buf1 = new byte[ins1.available()];

        while (ins1.available() > 0) {
            ins1.read(buf1);
            if (buf1.length % 2 != 0) {
                int ch1 = buf1.length / 2 + 1;
                out2.write(buf1, 0, ch1);
                out3.write(buf1, ch1, buf1.length / 2);
            } else {
                int ch = buf1.length / 2;
                out2.write(buf1, 0, ch);
                out3.write(buf1, ch, buf1.length / 2);
            }
        }
        ins1.close();
        out2.close();
        out3.close();
    }}