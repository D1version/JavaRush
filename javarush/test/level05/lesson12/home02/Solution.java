package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {

        Man man3 = new Man("Joroh",15,"kalinina");
        Man man4 = new Man("Kolya",23,"novosel");
        Woman woman3 = new Woman("Maria",18,"kahovka");
        Woman woman4 = new Woman("Kristina",28,"kharkov");

        System.out.println(man3);
        System.out.println(man4);
        System.out.println(woman3);
        System.out.println(woman4);
    }

    public static class Man
    {

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        String name;
        int age;
        String address;
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman
    {

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        String name;
        int age;
        String address;
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
