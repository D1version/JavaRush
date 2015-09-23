package com.javarush.test.level19.lesson08.task03;

/* Выводим только цифры
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить только цифры
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

Пример вывода:
12345678
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(a);
        System.setOut(stream);
        testString.printSomething();
        String result = a.toString();
        System.setOut(console);
        char[] aa = result.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < aa.length; i++)
        {
            if(aa[i] == '0') list.add(aa[i]);
            else if(aa[i] == '1') list.add(aa[i]);
            else if(aa[i] == '2') list.add(aa[i]);
            else if(aa[i] == '3') list.add(aa[i]);
            else if(aa[i] == '4') list.add(aa[i]);
            else if(aa[i] == '5') list.add(aa[i]);
            else if(aa[i] == '6') list.add(aa[i]);
            else if(aa[i] == '7') list.add(aa[i]);
            else if(aa[i] == '8') list.add(aa[i]);
            else if(aa[i] == '9') list.add(aa[i]);
            else continue;
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
