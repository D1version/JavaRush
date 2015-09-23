package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner file1 = new Scanner(new File(reader.readLine()));
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        while (file1.hasNext()) {
            Long m = Math.round(file1.nextDouble());
            file2.write((m.toString() + " ").getBytes());
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
