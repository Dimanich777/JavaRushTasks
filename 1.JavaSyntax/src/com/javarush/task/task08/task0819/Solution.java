package com.javarush.task.task08.task0819;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        printCats(cats);
        for(Cat x : cats){
            cats.remove(x);
            break;
        }
    }


    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<Cat>();
        Collections.addAll(set, new Cat(), new Cat(), new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat x : cats){
            System.out.println(x);
        }

    }

    public static class  Cat {

    }
    // step 1 - пункт 1
}
