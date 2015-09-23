package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        int count = 0;
        int spaces = 0;
        int number;

        FileInputStream reader = new FileInputStream(args[0]);

        while ((number = reader.read()) != -1) {
            count++;
            if (number == 32) {
                spaces++;
            }

        }
        double res = (double) spaces / count * 100;
        System.out.println(String.format(Locale.ENGLISH, "%.2f", res));
        reader.close();

    }
}
