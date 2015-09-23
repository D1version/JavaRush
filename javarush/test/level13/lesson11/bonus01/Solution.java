package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        InputStream openFile=new FileInputStream(fileName);
        BufferedReader readFile=new BufferedReader(new FileReader(fileName));
        ArrayList array=new ArrayList();
        reader.close();

        while (readFile.ready())
        {
            int i = Integer.parseInt(readFile.readLine());
            if (i % 2 == 0)
            {
                array.add(i);
            }
        }

        openFile.close();
        readFile.close();
       Collections.sort(array);
        for (int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }

    }
}

