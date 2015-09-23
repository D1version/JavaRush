package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r.readLine());
        FileWriter writer = new FileWriter(r.readLine());
        String s = String.valueOf((char)reader.read());
        while(reader.ready())
        {
            s+= String.valueOf((char)reader.read());
        }
        String[] ss = s.split(" ");
        for (int i = 0; i < ss.length; i++)
        {
            try
            {
                Integer.parseInt(ss[i]);
                writer.write(ss[i]);
                writer.write(" ");
            }
            catch(Exception e)
            {
                continue;
            }
        }
        r.close();
        reader.close();
        writer.close();

    }
}
