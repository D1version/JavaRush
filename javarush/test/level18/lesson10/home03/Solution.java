package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(reader.readLine());
        FileInputStream in1 = new FileInputStream(reader.readLine());
        FileInputStream in2 = new FileInputStream(reader.readLine());
        int a = 0;

        while(in1.available()>0)
        {
            a = in1.read();
            out.write(a);
        }

        while(in2.available()>0)
        {
            a = in2.read();
            out.write(a);
        }

        reader.close();
        out.close();
        in1.close();
        in2.close();

    }
}
