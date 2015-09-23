package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer t = new StringTokenizer(query,delimiter);
        String[] a = new String[t.countTokens()];
        int i = 0;
        while(t.hasMoreTokens())
        {
            a[i] = t.nextToken();
            i++;
        }

        return a;
    }
}
