package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
        {
            list.add("Privet");
        }
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
        {
            list1.add("Kak");
        }
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
        {
            list2.add("Dela");
        }

        arrayOfStringList[0] = list;
        arrayOfStringList[1] = list1;
        arrayOfStringList[2] = list2;


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}