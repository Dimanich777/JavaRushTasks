package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            InputStream is = new FileInputStream(new File(""));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[0];
            int a = array[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("qwe");

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            obj.hashCode();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }


        try {
            new Solution().clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }


        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException in) {
            exceptions.add(in);
        }


        //напишите тут ваш код

    }
}

