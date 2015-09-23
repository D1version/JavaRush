package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("January"))
            System.out.print(s + " is 1 month");
        else if(s.equals("February"))
            System.out.print(s + " is 2 month");
        else if(s.equals("March"))
            System.out.print(s + " is 3 month");
        else if(s.equals("April"))
            System.out.print(s + " is 4 month");
        else if(s.equals("May"))
            System.out.print(s + " is 5 month");
        else if(s.equals("June"))
            System.out.print(s + " is 6 month");
        else if(s.equals("July"))
            System.out.print(s + " is 7 month");
        else if(s.equals("August"))
            System.out.print(s + " is 8 month");
        else if(s.equals("September"))
            System.out.print(s + " is 9 month");
        else if(s.equals("October"))
            System.out.print(s + " is 10 month");
        else if(s.equals("November"))
            System.out.print(s + " is 11 month");
        else if(s.equals("December"))
            System.out.print(s + " is 12 month");

    }

}
