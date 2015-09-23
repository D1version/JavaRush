package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandFa = reader.readLine();

        String GrandMa = reader.readLine();

        String fatherName = reader.readLine();

        String motherName = reader.readLine();

        String SonName = reader.readLine();

        String daughterName = reader.readLine();



        Cat cat1 = new Cat(GrandFa);
        Cat cat2 = new Cat(GrandMa);
        Cat cat3 = new Cat(fatherName, cat1, null );
        Cat cat4 = new Cat(motherName,  null, cat2);
        Cat cat5 = new Cat(SonName, cat3, cat4);
        Cat cat6 = new Cat(daughterName, cat3, cat4);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);


    }

    public static class Cat
    {
        public  Cat mother;
        public  Cat father;
        public  String name;

        Cat(String name)
        {
            this.name = name;

        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()

        {

            if (father == null && mother == null)
            return "Cat name is " + name + ", no mother" + ", no father" ;
            else if (mother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father" ;
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;


        }

    }

}
