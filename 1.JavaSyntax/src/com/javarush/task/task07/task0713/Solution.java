package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> lll = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(rd.readLine()));
            if (list.get(i) % 3 == 0) {
                l3.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                l2.add(list.get(i));
            }
            if (!(list.get(i) % 2 == 0 || list.get(i) % 3 == 0)) {
                lll.add(list.get(i));
            }
        }
        printList(l3);
        printList(l2);
        printList(lll);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}