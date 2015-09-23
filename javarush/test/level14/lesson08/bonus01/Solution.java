package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            float i = 2 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 3 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 4 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 5 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 6 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 7 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 8 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 9 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 10 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
