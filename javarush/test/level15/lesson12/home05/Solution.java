package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(String a,int b)
    {

    }
    private Solution(int a,int b)
    {

    }
    private Solution(String a,String b)
    {

    }
    Solution(Integer a, int v)
    {

    }
    Solution(Integer a, Integer v)
    {

    }
    Solution(String a, Integer v)
    {

    }
    public Solution()
    {
    }
    public Solution(String a)
    {
    }
    public Solution(Integer b)
    {
    }
    protected Solution(Integer a, int v,int aa)
    {

    }
    protected Solution(String a, int v,int aa)
    {

    }
    protected Solution(Integer a, String v,int aa)
    {

    }

}

