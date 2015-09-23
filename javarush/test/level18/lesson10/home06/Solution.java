package com.javarush.test.level18.lesson10.home06;

import java.io.*;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args[0]);
        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        while (fileReader.available() > 0) {

            int ch = fileReader.read();
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        fileReader.close();

        for (SortedMap.Entry<Integer, Integer> entry : map.entrySet()) {

                System.out.println((char) (int) entry.getKey() + " " + entry.getValue());

        }
    }
}
