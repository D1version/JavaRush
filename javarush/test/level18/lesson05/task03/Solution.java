package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        FileOutputStream out1 = new FileOutputStream(reader.readLine());
        FileOutputStream out2 = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int a;
        int b;
        int c = stream.available()/2;
        int d = stream.available() - c;

        while(c > 0)
        {
            a = stream.read();
            list2.add(a);
            c--;
        }

        while(d > 0)
        {
            b = stream.read();
            list1.add(b);
            d--;
        }

        for (int i = 0; i < list1.size(); i++)
        {
            out1.write(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++)
        {
            out2.write(list2.get(i));
        }

        reader.close();
        stream.close();
        out1.close();
        out2.close();


    }
}
