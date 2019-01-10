package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution  extends Solution  {

        private void writeObject (ObjectOutputStream obj) throws NotSerializableException {

        }

        private void readObject (ObjectInput in) throws NotSerializableException {

        }



    }

    public static void main(String[] args) {

    }
}
