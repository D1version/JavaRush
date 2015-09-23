package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        String line = "";
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in); BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()))) {
            while ((line = reader.readLine()) != null) {
                list.addAll(Arrays.asList(line.split(" ")));
            }

            for (int i = 0; i < list.size() ; i++) {
                String s = list.get(i);
                String reverse = new StringBuffer(s).reverse().toString();
                if (list.indexOf(reverse) != -1 & !s.equals("") & !s.equals(reverse)) {
                    result.add(new Pair(s, reverse));
                    list.remove(s);
                    list.remove(reverse);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }


        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
