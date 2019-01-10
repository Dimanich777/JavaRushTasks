package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {


        ArrayList<Human> child = new ArrayList<>();
        child.add(new Human("Danya", true, 6));
        child.add(new Human("Erick", true, 5));
        child.add(new Human("Yula", false, 6));


        Human Father = new Human("Sasha", true, 35, child);
        Human Mother = new Human("Inna", false, 28, child);
        ArrayList<Human> parentFather = new ArrayList<>();
        parentFather.add(Father);
        ArrayList<Human> parentMother = new ArrayList<>();
        parentMother.add(Mother);


        Human GrandfatherFather = new Human("Vladimir", true, 56);
        Human GrandfatherMothet = new Human("Lyudmila", false, 54);
        Human GrandmothetFather = new Human("Serg", true, 52);
        Human GrandmothetMother = new Human("Rusudan", false, 50);


        System.out.println(GrandfatherFather + "\n" +
                GrandfatherMothet + "\n" +
                GrandmothetFather + "\n" +
                GrandmothetMother + "\n" +
                Father + "\n" +
                Mother + "\n" +
                child.get(0) + "\n" +
                child.get(1) + "\n" +
                child.get(2));
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}


