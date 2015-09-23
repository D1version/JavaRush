package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<String>();
        set.add("Ла");
        set.add("Лаф");
        set.add("Лав");
        set.add("Лар");
        set.add("Лаы");
        set.add("Лаг");
        set.add("Лачс");
        set.add("Лаыф");
        set.add("Лафыв");
        set.add("Лафывфы");
        set.add("Лафывфыв");
        set.add("Лаждлл");
        set.add("Лафдолп");
        set.add("Лахщзшщш");
        set.add("Лафф");
        set.add("Лаяя");
        set.add("Лаяф");
        set.add("Лафя");
        set.add("Латтит");
        set.add("Лалфоывл");
        return (HashSet<String>)set;
    }
}
