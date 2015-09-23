package com.javarush.test.level02.lesson08.task03;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list= new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        int max = list.get(0).length();
        for (int i = 0; i<list.size(); i++)
        {
            if (list.get(i).length() > max)
                max = list.get(i).length();

        }
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() >= max)
                list2.add(list.get(i));
        }
        for (int i = 0; i < list2.size(); i++)
        {
            System.out.println(list2.get(i));
        }

    }
}