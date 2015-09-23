package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {

        Human Павел = new Human("Павел", true, 55, null, null);
        Human Катя = new Human("Катя", false, 54, null, null);
        Human Коля = new Human("коля", true, 61, null, null);
        Human Вика = new Human("Вика", false, 60, null, null);
        Human Аня = new Human("Аня", false, 21, Павел, Катя);
        Human Денис = new Human("Денис", true, 22, Коля, Вика);
        Human Алёна = new Human("Алёна", false, 1, Денис, Аня);
        Human Вадим = new Human("Вадим", true, 3, Денис, Аня);
        Human Алёша = new Human("Алёна", false, 5, Денис, Аня);
        System.out.println(Павел);
        System.out.println(Катя);
        System.out.println(Коля);
        System.out.println(Вика);
        System.out.println(Аня);
        System.out.println(Денис);
        System.out.println(Алёна);
        System.out.println(Вадим);
        System.out.println(Алёша);

    }

    public static class Human
    {
        private final String name;
        private final boolean sex;
        private final int age;
        private final Human father;
        private final Human mother;

        private Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
