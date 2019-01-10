package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new LoopThread());
        threads.add(new InterruptedThread());
        threads.add(new CheersThread());
        threads.add(new MessageThread());
        threads.add(new SummThread());
    }

    public static class LoopThread extends Thread {
        public LoopThread() {
            super();
        }

        public void run() {
            while (true) {}
        }
    }

    public static class InterruptedThread extends Thread {
        public InterruptedThread() {
            super();
        }

        public void run() {
            try {
                while (!isInterrupted()) {
                }
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class CheersThread extends Thread {
        public CheersThread() {
            super();
        }

        public void run() {

            System.out.println("Стартует нить №3");

            while (true) {
                try {
                    System.out.println("Ура");
                    System.out.println("0сек : " + new Date().getSeconds());
                    Thread.sleep(500);
                    System.out.println("5сек : " + new Date().getSeconds());
                } catch (InterruptedException e) {}

            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        public MessageThread() {
            super();
        }

        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class SummThread extends Thread {
        public SummThread() {
            super();
        }

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer summ = 0;
            try {
                while (true) {
                    String s = reader.readLine();
                    try {
                        Integer i = Integer.parseInt(s);
                        summ += i;
                    } catch (Exception e2) {
                        if ("N".equals(s)) break;
                    }
                }
                System.out.println(summ);
            } catch (Exception e) {
            }
        }
    }
}