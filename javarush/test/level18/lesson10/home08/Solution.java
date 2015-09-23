package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            else {
                ReadThread thread = new ReadThread(fileName);
                thread.start();
            }
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run()
        {
            try {
                FileInputStream fis = new FileInputStream(this.fileName);
                ArrayList<Integer> list = new ArrayList<Integer>();
                while (fis.available()>0){
                    int data = fis.read();
                    list.add(data);
                }

                int maxByte = 0;
                int maxCount = 0;
                int count = 0;
                for (int i=0; i<list.size(); i++) {
                    count = Collections.frequency(list, list.get(i));
                    if (count>maxCount) {
                        maxCount=count;
                        maxByte=list.get(i);
                    }
                }
                resultMap.put(this.fileName, maxByte);
            }
            catch (Exception e) {
            }
        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
