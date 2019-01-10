package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
*/

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {//3.Ну и здесь модификатор поменять
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialized();// 2.Потоми здесь тоже исправить
        }

        protected void initialized() { //1.Сначала нужно переименовать этот метод
            System.out.println(f1);
        }
    }
}