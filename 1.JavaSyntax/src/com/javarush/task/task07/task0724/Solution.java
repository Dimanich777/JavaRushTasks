package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human ded1 = new Human("sdfga",true,700);
        Human ded2 = new Human("sdg",true,70120);
        Human bab1 = new Human("sdfgsdfha",false,7010);
        Human bab2 = new Human("sdfgsdfjdajka",false,7030);
        Human mum = new Human("lol",false,7,ded1,bab1);
        Human dad = new Human("kek",true,2,ded2,bab2);
        Human sin1 = new Human("cheburek",true,2,dad,mum);
        Human sin2 = new Human("irak",true,2,dad,mum);
        Human doch = new Human("afganistan",false,2,dad,mum);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(mum);
        System.out.println(dad);
        System.out.println(sin1);
        System.out.println(sin2);
        System.out.println(doch);


    }

    public static class Human {


        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }




        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















