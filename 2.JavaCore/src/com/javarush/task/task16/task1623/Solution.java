package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads ;

    public static void main(String[] args) {
        countCreatedThreads = 1;
        // if(countCreatedThreads != 0){
        System.out.println(new GenerateThread());

        //}

        //}
    }

    public static class GenerateThread extends Thread {
        //GenerateThread gT;
        public   GenerateThread(){

            super(String.valueOf(++countCreatedThreads));
            start();

        }

        @Override
        public void run() {
            if ( countCreatedThreads <= count){
                System.out.println(new GenerateThread());

            }
        }


        @Override
        public String toString() {
            return super.getName() + " created" ;
        }
    }
}
