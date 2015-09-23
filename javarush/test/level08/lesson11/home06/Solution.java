package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> children1 = new ArrayList<Human>();
        ArrayList<Human> children2 = new ArrayList<Human>();
        ArrayList<Human> children3 = new ArrayList<Human>();
        ArrayList<Human> children4 = new ArrayList<Human>();
        ArrayList<Human> children5 = new ArrayList<Human>();

        Human child3 = new Human("kirarr", true, 19,children3);
        Human child2 = new Human("kirar", false, 17,children4);
        Human child1 = new Human("kira", true, 18,children5);
        children.add(0, child1);
        children.add(1, child2);
        children.add(2, child3);
        Human father = new Human("Kolya", false, 43, children);
        Human mother = new Human("Maxim", true, 41, children);
        children1.add(0, father);
        children2.add(0, mother);
        Human grandmo1 = new Human("galia", false, 77, children1);
        Human grandfa1 = new Human("Vaska", true, 78, children1);
        Human grandmo2 = new Human("galia1", false, 77, children2);
        Human grandfa2 = new Human("Vaska1", true, 78, children2);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandmo1);
        System.out.println(grandfa1);
        System.out.println(grandmo2);
        System.out.println(grandfa2);
    }

    public static class Human extends ArrayList<Human>
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
