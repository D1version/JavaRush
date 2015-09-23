package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        String line = "";

        StringBuilder sb = new StringBuilder();
        while ((line = fr.readLine()) != null)
        {
            sb.append(line);
            sb.append("\n");
        }
        String dt = sb.toString();
        String [] data = dt.split("\n");
        HashMap<String, Double> hm = new HashMap<String, Double>();
        for (int i = 0; i < data.length; i++)
        {
            String[] ar = data[i].split(" ");
            Double d;
            if (hm.containsKey(ar[0]))
            {
                d = hm.remove(ar[0]);
                hm.put(ar[0], Double.parseDouble(ar[1]) + d);
            }
            else
                hm.put(ar[0], Double.parseDouble(ar[1]));
        }

        String names = "";
        double minValue = 0;

        for (Map.Entry<String, Double> m : hm.entrySet())
        {
            if (m.getValue() > minValue)
            {
                minValue = m.getValue();
                names = m.getKey();
            } else if (m.getValue() == minValue)
            {
                minValue = m.getValue();
                names = names + "\n" + m.getKey();
            }
        }
        System.out.println(names);
        fr.close();
    }
}

