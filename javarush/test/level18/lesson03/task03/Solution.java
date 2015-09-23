package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int data;
        while (file.available() > 0) {
            data = file.read();
            map.put(data, 0);
            list.add(data);
        }

        for (Map.Entry<Integer, Integer> tmp1 : map.entrySet()) {
            for (Integer tmp2 : list) {
                if (tmp1.getKey() == tmp2) tmp1.setValue(tmp1.getValue()+1);
            }
        }

        list.clear();
        list.addAll(map.values());
        Collections.sort(list);

        for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
            if (tmp.getValue() == list.get(list.size() - 1)) System.out.print(tmp.getKey() + " ");
        }

    }
}

