package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int buffer;
        for (int i = 0; i < 5; i++)
        {
            if (a > b)
            {
                buffer = b;
                b = a;
                a = buffer;
            }

            if (b > c)
            {
                buffer = c;
                c = b;
                b = buffer;
            }

            if (c > d)
            {
                buffer = d;
                d = c;
                c = buffer;
            }

            if (d > e)
            {
                buffer = e;
                e = d;
                d = buffer;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

