package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] massiv = new int[20];
        for(int i = 0; i < 20; i++)
        {
            String s = reader.readLine();
            massiv[i] = Integer.parseInt(s);
        }

        int[] massiv1 = new int[10];
        int[] massiv2 = new int[10];

        for(int i = 0; i < 10; i++)
        {
            massiv1[i] = massiv[i];
        }

        massiv2[0] = massiv[10];
        massiv2[1] = massiv[11];
        massiv2[2] = massiv[12];
        massiv2[3] = massiv[13];
        massiv2[4] = massiv[14];
        massiv2[5] = massiv[15];
        massiv2[6] = massiv[16];
        massiv2[7] = massiv[17];
        massiv2[8] = massiv[18];
        massiv2[9] = massiv[19];

        for(int i = 0; i < 10; i++)
        {
            System.out.println(massiv2[i]);
        }

    }
}
