package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[1];
        String fileOutputName = args[2];
        try {
            crypt(fileName, fileOutputName);
        } catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    public static void crypt(String f1, String f2) throws IOException {
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);
        while (in.available() > 0) {
            int data = in.read();
            out.write(data^5);
        }
        in.close();
        out.close();
    }
}
