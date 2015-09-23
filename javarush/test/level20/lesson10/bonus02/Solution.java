package com.javarush.test.level20.lesson10.bonus02;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == 1){
                    count++;
                    a = deleteRectangle(a,i,j);
                }
            }
        }
        return count;
    }

    public static byte[][] deleteRectangle(byte[][] matrix, int i, int j){

        matrix[i][j] = 0;

        if (i > 0 && matrix[i - 1][j] == 1) {
            matrix = deleteRectangle(matrix, i - 1, j);
        }

        if (j > 0 && matrix[i][j - 1] == 1) {
            matrix = deleteRectangle(matrix, i, j-1);
        }

        if (i + 1 < matrix.length && matrix[i + 1][j] == 1) {
            matrix = deleteRectangle(matrix, i + 1, j);
        }

        if (j + 1 < matrix[0].length && matrix[i][j+1] == 1) {
            matrix = deleteRectangle(matrix, i, j+1);
        }
        return matrix;
    }

}
