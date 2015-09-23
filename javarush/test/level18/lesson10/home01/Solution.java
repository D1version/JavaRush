package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<Character> list = new ArrayList<>();

        while(reader.ready())
        {
            list.add((char)reader.read());
        }

        int count = 0;
        String s;
        for (int i = 0; i < list.size(); i++)
        {
            s = String.valueOf(list.get(i));
            if(s.matches("[a-zA-Z]")) count++;
        }

        System.out.print(count);
        reader.close();
    }
}
