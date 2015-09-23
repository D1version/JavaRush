package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        FileOutputStream outstream = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        while(stream.available() > 0)
        {
            a = stream.read();
            list.add(a);
        }

        for (int i = list.size() - 1; i >= 0; i--)
        {
            outstream.write(list.get(i));
        }
        reader.close();
        stream.close();
        outstream.close();

    }
}
