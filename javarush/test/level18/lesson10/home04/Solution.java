package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String File_name1 = r.readLine();
        String File_name2 = r.readLine();
        FileInputStream fr = new FileInputStream(File_name1);

        byte[] a = new byte[fr.available()];
        fr.read(a);
        FileInputStream fr2 = new FileInputStream(File_name2);
        byte[] b = new byte[fr2.available()];
        fr2.read(b);
        FileOutputStream wr = new FileOutputStream(File_name1);
        wr.write(b);
        wr = new FileOutputStream(File_name1, true);
        wr.write(a);

        r.close();
        fr.close();
        fr2.close();
        wr.close();
    }
}
