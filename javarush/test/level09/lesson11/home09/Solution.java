package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");
        Cat cat6 = new Cat("cat6");
        Cat cat7 = new Cat("cat7");
        Cat cat8 = new Cat("cat8");
        Cat cat9 = new Cat("cat9");
        Cat cat10 = new Cat("cat10");

      Map<String, Cat> list = new HashMap<String, Cat>();
        list.put("cat1", cat1);
        list.put("cat2", cat2);
        list.put("cat3", cat3);
        list.put("cat4", cat4);
        list.put("cat5", cat5);
        list.put("cat6", cat6);
        list.put("cat7", cat7);
        list.put("cat8", cat8);
        list.put("cat9", cat9);
        list.put("cat10", cat10);
        return list;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();

        for (Map.Entry<String, Cat> list : map.entrySet())
        {
            set.add(list.getValue());
        }

        return set;

    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
