package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        String[] temp = date.split(" ");

        Date before = new Date(date);
        Date after = new Date("JANUARY 0 " + date.split(" ")[2]);

        long difference = before.getTime() - after.getTime();

        int day = (int) (difference / (24 * 60 * 60 * 1000));


        if (day % 2 == 0)
        {
            return false;
        } else return true;

    }
}

