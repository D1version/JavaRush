package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(Cat.cat1);
        result.add(Cat.cat2);
        result.add(Cat.cat3);
        result.add(Cat.cat4);

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(Dog.dog1);
        result.add(Dog.dog2);
        result.add(Dog.dog3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> join = new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        for (Cat x : cats)
            pets.remove(x);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object x : pets)
            System.out.println(x);

    }

    public static class Cat
    {
        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();
        static Cat cat4 = new Cat();
    }

    public static class Dog
    {
        static Dog dog1 = new Dog();
        static Dog dog2 = new Dog();
        static Dog dog3 = new Dog();
    }
}
