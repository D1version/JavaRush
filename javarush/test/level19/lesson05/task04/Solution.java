package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r.readLine());
        FileWriter writer = new FileWriter(r.readLine());

        while(reader.ready())
        {
            int a = reader.read();
            if((char)a == '.')
                a = '!';
            writer.write(a);

        }
        r.close();
        reader.close();
        writer.close();
    }
}
