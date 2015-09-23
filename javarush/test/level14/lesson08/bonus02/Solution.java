package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Integer n1 = Integer.parseInt(rd.readLine());
        Integer n2 = Integer.parseInt(rd.readLine());

        int min = 0;
        min = (n1 > n2) ? n2 : n1;

        int delitel = 1;

        for (int i = 1; i <= min; i++)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                delitel = i;
            }
        }

        System.out.println(delitel);
    }
}
