package com.javarush.test.level31.lesson02.home02;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* Находим все файлы
Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используйте очередь, рекурсию не используйте.
Верните список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        File rootDir = new File(root);
        Queue<File> queue = new ArrayDeque<>();
        File[] subDirs = rootDir.listFiles();
        if (subDirs != null)
            Collections.addAll(queue, subDirs);
        while (!queue.isEmpty()) {
            File file = queue.poll();
            if (file.isDirectory() && (subDirs = file.listFiles()) != null) {
                Collections.addAll(queue, subDirs);
            }
            if (file.isFile()) result.add(file.getAbsolutePath());
        }
        return result;

    }
}
