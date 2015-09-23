package com.javarush.test.level12.lesson02.task05;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        String simpleName = o.getClass().getSimpleName();
        String print = "";
        if(simpleName.equals("Cow"))
            print = "Корова";
        else if(simpleName.equals("Dog"))
            print = "Собака";
        else if(simpleName.equals("Whale"))
            print = "Кит";
        else print = "Неизвестное животное";

return print;
    }

    public static class Cow
    {
    }

    public static class Dog
    {
    }

    public static class Whale
    {
    }

    public static class Pig
    {
    }
}
