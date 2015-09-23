package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        Scanner scanner = new Scanner(new File(args[0]));
        FileWriter fr = new FileWriter(args[1]);

        while(scanner.hasNextLine())
        {
            String[] str = scanner.nextLine().split(" ");
            for (int i = 0; i < str.length ; i++)
            {
                for (int j = 0; j < str[i].toCharArray().length; j++)
                {
                    if(Character.isDigit(str[i].charAt(j)))
                    {
                        fr.write(str[i] + " ");
                        break;
                    }
                }

            }
        }
        scanner.close();
        fr.close();
    }
}
