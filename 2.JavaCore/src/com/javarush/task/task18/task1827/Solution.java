package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //args = new String[] {"-u", "3", "qqqqqqqqqqq", "321", "23"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        //file="c:\\"+file;
        reader.close();

        ArrayList<String> strings = getStrings(file);

        if(args[0].equals("-u"))
        {

            String id = doneName(args[1],8);
            String productName = doneName(args[2],30);
            String price = doneName(args[3],8);
            String quantity = doneName(args[4],4);
            String ourString = id+productName+price+quantity;

            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line;
            String currId;
            int count=0;
            while ((line=fileReader.readLine())!=null)
            {
                currId=line.substring(0,8).trim();
                if(Integer.parseInt(id.trim())==Integer.parseInt(currId))
                {
                    strings.set(count,ourString);
                    break;
                }
                count++;
            }
            fileReader.close();
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file,false));
            for (int i = 0; i <strings.size() ; i++)
            {
                fileWriter.write(strings.get(i));
                if(i!=strings.size()-1) // important for javarush, mthfck
                {
                    fileWriter.newLine();
                }
            }
            fileWriter.close();
        }
        else if(args[0].equals("-d"))
        {
            String id = doneName(args[1],8);

            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line;
            String currId;
            int count=0;
            while ((line=fileReader.readLine())!=null)
            {

                currId=line.substring(0,8).trim();
                if(Integer.parseInt(id.trim())==Integer.parseInt(currId))
                {
                    strings.remove(count);
                    break;
                }
                count++;
            }
            fileReader.close();
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file,false));
            for (int i = 0; i <strings.size() ; i++)
            {
                fileWriter.write(strings.get(i));
                if(i!=strings.size()-1)
                {
                    fileWriter.newLine();
                }
            }
            fileWriter.close();
        }

    }


    private static ArrayList<String> getStrings(String name) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(name));
        ArrayList<String> allStrings = new ArrayList<>();
        String line;
        while((line=reader.readLine())!=null)
        {
            allStrings.add(line);
        }
        reader.close();
        return allStrings;
    }



    private static String doneName(String name, int numb)
    {
        char[] c = name.toCharArray();
        int realnumb = c.length;
        int spaceNumb = numb-realnumb;
        String tmp = "";
        for (int i = 0; i < spaceNumb; i++)
        {
            tmp = tmp+" ";
        }
        return name+tmp;

    }

}