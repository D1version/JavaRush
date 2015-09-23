package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.indexOf('\t') < 0) {
            throw new TooShortStringException();
        }

        int firstTab = string.indexOf('\t'), secondTab = string.indexOf('\t', firstTab + 1);

        if (secondTab > 0) {
            return string.substring(firstTab + 1, secondTab);
        } else {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }
}
