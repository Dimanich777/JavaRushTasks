package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
CRUD 2
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static int metKa = 0;
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        Person person = null;
        String str = "";
        Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
        Matcher matcher;
        if (args[0].equals("-c"))
        {
            for (int i = 1; i < args.length ; i++)
            {
                matcher = pattern.matcher(args[i]);
                if (matcher.matches())
                {
                    SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                    str = args[i-2];

                    int index = i - metKa;
                    if (index == 4)
                    {
                        str = args[metKa+1] + " " + args[metKa+2];
                    }
                    if (index == 5)
                    {
                        str = args[metKa+1] + " " + args[metKa+2] + " " + args[metKa+3];
                    }

                    if (args[i - 1].equals("м"))
                    {
                        person = Person.createMale(str,dateformat.parse(args[i]));
                        allPeople.add(person);
                    }
                    if (args[i - 1].equals("ж"))
                    {
                        person = Person.createFemale(str,dateformat.parse(args[i]));
                        allPeople.add(person);
                    }
                    metKa = i;

                }
            }
        }

        if (args[0].equals("-u"))
        {metKa = 0;
            for (int i = 1; i < args.length; i++)
            {
                SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                str = args[metKa+2];
                matcher = pattern.matcher(args[i]);
                person = allPeople.get(Integer.parseInt(args[metKa+1]));
                if (matcher.matches())
                {
                    int dlina = i - metKa;
                    if (dlina == 5)
                    {
                        str = args[metKa+2] + " " + args[metKa+3];
                    }
                    if (dlina == 6)
                    {
                        str = args[metKa+2] + " " + args[metKa+3] + " " + args[metKa+4];
                    }
                    person.setBirthDay(dateformat.parse(args[i]));
                    person.setSex(args[i - 1].equals("м") ? Sex.MALE : Sex.FEMALE);
                    person.setName(str);
                    metKa = i++;
                }
            }
        }
        if (args[0].equals("-d"))
        {
            for (int i = 0; i < args.length-1; i++)
            {

                person = allPeople.get(i);
                person.setName(null);
                person.setBirthDay(null);
                person.setSex(null);
            }
        }
        if (args[0].equals("-i"))
        {
            SimpleDateFormat tda = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            for (int i = 0; i < args.length-1;i++)
            {
                person = allPeople.get(i);
                String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                System.out.println(person.getName() + " " + sex + " " + tda.format(person.getBirthDay()));
            }
        }
        //start here - начни тут
    }

}