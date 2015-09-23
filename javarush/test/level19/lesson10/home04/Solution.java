package com.javarush.test.level19.lesson10.home04;

import java.io.*;
import java.util.*;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException
    {   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(buf.readLine()));
        buf.close();
        while (reader.ready())
        {
            int count = 0;
            String jj = reader.readLine();
            String[] rr = jj.split(" ");
            for (String v : words)
            {
                for (String l : rr)
                {
                    if (l.equals(v))
                    {
                        count++;
                    }
                }

            }
            if (count == 2) System.out.println(jj);
        }
        reader.close();
    }
}

