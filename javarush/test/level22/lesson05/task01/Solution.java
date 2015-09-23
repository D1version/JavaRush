package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
*/
public class Solution
{
    public static String getPartOfString(String string) throws TooShortStringException
    {
        String result = null;

        if (string == null || string.isEmpty() || !string.contains(" ") || string.length() < 5)
            throw new TooShortStringException();

        String[] arr = string.split(" ");

        if (arr.length < 5)
            throw new TooShortStringException();

        result = arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4];

        return result;

    }
    public static class TooShortStringException extends Exception
    {
    }


}


