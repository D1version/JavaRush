package com.javarush.test.level08.lesson08.task04;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallonee", new Date("OCTOBER 1 1980"));
        map.put("Stalloneee", new Date("MAY 1 1980"));
        map.put("Stallone33", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("DECEMBER 1 1980"));
        map.put("Stallone1", new Date("NOVEMBER 1 1980"));
        map.put("Stallone11", new Date("AUGUST 1 1980"));
        map.put("Stallone111", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("SEPTEMBER 1 1980"));

        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
            }
        }

    }
}
