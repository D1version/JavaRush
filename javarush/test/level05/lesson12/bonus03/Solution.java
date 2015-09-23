package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(reader.readLine());
        int[] a = new int[N];


        for (int i = 0; i < a.length; i++)
        {
            int aa = Integer.parseInt(reader.readLine());
            a[i] = aa;
        }
        int maximum = a[0] ;

        for (int i = 0; i < a.length ; i++)
        {
            if(maximum <= a[i])
                maximum = a[i];
        }

        System.out.println(maximum);
    }
}

