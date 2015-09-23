package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int a, int b)
    {
        int min = 0;
        if(a<b)
            min = a;
        else min = b;
        return min;
    }
    public static long min(long a, long b)
    {
        long min = 0;
        if(a<b)
            min = a;
        else min = b;
        return min;
    }
    public static double min(double a, double b)
    {
        double min = 0;
        if(a<b)
            min = a;
        else min = b;
        return min;
    }
}
