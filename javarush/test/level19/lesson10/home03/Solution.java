package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException
    {
        Scanner scanner = new Scanner(new File(args[0]));
        while (scanner.hasNextLine())
        {
            String[] str = scanner.nextLine().split(" ");

                String b = str[str.length - 3] + " " + str[str.length - 2] + " " + str[str.length - 1];
                Date date = new SimpleDateFormat("dd MM yyyy").parse(b);

                if (str.length > 4)
                {
                    String a = str[0] + " ";
                    for (int j = 1; j < str.length - 3; j++)
                    {
                        a += str[j] + " ";
                    }
                   a = a.trim();

                    PEOPLE.add(new Person(a, date ));
                } else
                    PEOPLE.add(new Person(str[0], date));

        }
        scanner.close();
    }
}
