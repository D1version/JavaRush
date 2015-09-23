package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static class Cat
    {
       static Cat Cat1 = new Cat();
       static Cat Cat2 = new Cat();
        static Cat Cat3 = new Cat();
    }

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        cats.remove(Cat.Cat3);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(Cat.Cat1);
        cats.add(Cat.Cat2);
        cats.add(Cat.Cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext())
        {

            Cat text = iterator.next();

            System.out.println(text);
        }
    }


}
