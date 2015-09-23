package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream is = null;
        byte[] buf = null;
        TreeSet<String> set = new TreeSet<String>(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                int k = Integer.parseInt(o1.substring(o1.lastIndexOf(".part")+5));
                int v = Integer.parseInt(o2.substring(o2.lastIndexOf(".part")+5));
                if (k > v) return 1;
                else if (k < v) return -1;
                return 0;
            }
        });
        String fileName = "";
        while (true)
        {
            fileName = reader.readLine();
            if ("end".equals(fileName)) break;
            set.add(fileName);
        }

        File name = new File(set.first().substring(0, set.first().lastIndexOf(".part")));
        reader.close();
        FileOutputStream os = new FileOutputStream(name);
        for (String x : set)
        {
            is = new FileInputStream(x);
            buf = new byte[is.available()];
            is.read(buf, 0, is.available());
            os.write(buf);

        }
        is.close();
        os.close();
    }
}

