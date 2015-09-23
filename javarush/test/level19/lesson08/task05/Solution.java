package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String aa = r.readLine();
        r.close();
        PrintStream console = System.out;
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(a);
        System.setOut(stream);
        testString.printSomething();
        String result = a.toString();
        System.setOut(console);
        System.out.println(result);
        FileWriter wr = new FileWriter(aa);
        wr.write(result);

        wr.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

