package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }
    public static interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName = "";
        private StringBuffer fileContent = new StringBuffer();
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }
        @Override
        public String getFileContent() {
            return this.fileContent.toString();
        }
        @Override
        public void run() {
            try {
                String saveData;
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                while ((saveData = fileReader.readLine()) != null) {
                    this.fileContent.append(saveData + " ");
                }
                fileReader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}