package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bfr.readLine());
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        while (fis.available() > 0){
            int rByte = fis.read();
            if(!map.containsKey(rByte))
                map.put(rByte,1);
            else map.put(rByte,map.get(rByte).intValue()+1);
        }

        int max_Byte = 100;
        int max_Key = 0;
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,Integer> pair = itr.next();
            if (max_Byte > pair.getValue()){
                max_Byte = pair.getValue();
                max_Key = pair.getKey();
            }
        }
        itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer,Integer> pair = itr.next();
            if(pair.getValue()==max_Byte){
                for (int i = 0; i < pair.getValue(); i++)
                    System.out.print(pair.getKey()+" ");
            }
        }


       for (int i = 0; i < map.get(max_Key).intValue(); i++)
           System.out.print(map.get(max_Key)+" ");
            System.out.print(max_Key+" ");
        bfr.close();
        fis.close();
    }
}

