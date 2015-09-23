package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String key = reader.readLine();
            if (key.equals("exit")) break;
            boolean intFlag = false;
            for (int i = 0; i < key.length(); i++)
            {
                if ( key.charAt(i) =='.') {
                    print(Double.parseDouble(key));
                    intFlag = true;
                    break;}
            }
            int flag = 0;
            for (int i = 0; i < key.length(); i++)
            {
                if ( key.charAt(i) =='0' || key.charAt(i) =='1' || key.charAt(i) =='2' || key.charAt(i) =='3' || key.charAt(i) =='4'
                        || key.charAt(i) =='5' || key.charAt(i) =='6' || key.charAt(i) =='7' || key.charAt(i) =='8' || key.charAt(i) =='9' )
                {
                    flag++;
                }
            }
            if (flag == key.length())
            {
                int Stemp = Integer.parseInt(key);
                if ((Stemp < 128) && (Stemp > 0))
                {
                    print((short) Stemp);
                    intFlag = true;
                }
                if (Stemp >= 128 || (Stemp < 0))
                {
                    print(Stemp);
                    intFlag = true;
                }
            }
            if(!intFlag) print(key);
        }

    }



    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
