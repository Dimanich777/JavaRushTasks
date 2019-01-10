package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vasya", new Cat("Vasya")); //1
        map.put("Vasy", new Cat("Vasy")); //2
        map.put("Vas", new Cat("Vas")); //3
        map.put("Va", new Cat("Va")); //4
        map.put("V", new Cat("V")); //5
        map.put("Masha", new Cat("Masha")); //6
        map.put("Mash", new Cat("Mash")); //7
        map.put("Mas", new Cat("Mas")); //8
        map.put("Ma", new Cat("Ma")); //9
        map.put("M", new Cat("M")); //10

        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;
    }


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
