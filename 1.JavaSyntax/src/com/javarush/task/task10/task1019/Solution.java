package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <String>[] lists = new ArrayList[3];

        ArrayList<String> mas1= new ArrayList<>();
        ArrayList<String> mas2= new ArrayList<>();
        ArrayList<String> mas3= new ArrayList<>();



            mas1.add("Dima");
            mas1.add("Kami");
            mas1.add("love");

        mas2.add("Dima222");
        mas2.add("Kami2222");
        mas2.add("love2222");


        mas3.add("Dima3333");
        mas2.add("Kami3333");
        mas3.add("love33333");



        lists[0]=mas1;
        lists[1]=mas3;
        lists[2]=mas2;


        System.out.println(lists[2].get(2));


      /*  for (ArrayList<String> list :lists){
            System.out.println(list); */



        }


    }

