package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private String suprug;
        private int deti;
        private String mama;
        private String papa;
        private String brother;
        private String sister;
        private String grandma;
        private String grandfo;

        Human(String name)
        {
            this.name = name;
        }

        Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        Human(String name, int age, String mama)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
        }

        Human(String name, int age, String mama, String papa)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
        }

        Human(String name, int age, String mama, String papa, String brother)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
        }

        Human(String name, int age, String mama, String papa, String brother, String sister)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
            this.sister = sister;
        }

        Human(String name, int age, String mama, String papa, String brother, String sister, String suprug)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
            this.sister = sister;
            this.suprug = suprug;
        }

        Human(String name, int age, String mama, String papa, String brother, String sister, String suprug, int deti)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
            this.sister = sister;
            this.suprug = suprug;
            this.deti = deti;
        }

        Human(String name, int age, String mama, String papa, String brother, String sister, String suprug, int deti, String grandfo)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
            this.sister = sister;
            this.suprug = suprug;
            this.deti = deti;
            this.grandfo = grandfo;
        }
        Human(String name, int age, String mama, String papa, String brother, String sister, String suprug, int deti, String grandfo, String grandma)
        {
            this.name = name;
            this.age = age;
            this.mama = mama;
            this.papa = papa;
            this.brother = brother;
            this.sister = sister;
            this.suprug = suprug;
            this.deti = deti;
            this.grandfo = grandfo;
            this.grandma = grandma;
        }

    }
}
