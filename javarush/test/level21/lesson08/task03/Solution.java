package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
*/
public class Solution {
    public static class A implements Cloneable {

        @Override
        protected Object clone() throws CloneNotSupportedException
        {
             return super.clone();

        }

        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {

        protected B clone() throws CloneNotSupportedException
        {
            throw new CloneNotSupportedException();
        }

        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B implements Cloneable {
        @Override
        public C clone() throws CloneNotSupportedException
        {
            return new C(getI(), getJ(), getName());

        }

        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }
}
