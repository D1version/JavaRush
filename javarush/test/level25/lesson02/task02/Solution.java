package com.javarush.test.level25.lesson02.task02;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* Машину на СТО не повезем!
Инициализируйте поле wheels используя данные из loadWheelNamesFromDB.
Обработайте некорректные данные.
Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.
*/
public class Solution
{
    public static enum Wheel
    {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car
    {
        protected List<Wheel> wheels;

        public Car()
        {
            try
            {
                if (loadWheelNamesFromDB().length != 4)
                    throw new IllegalArgumentException();

                wheels = new LinkedList<>();
                Wheel[] list = Wheel.values();

                for (int i = 0; i < loadWheelNamesFromDB().length; i++)
                {
                        wheels.add(list[i]);
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.print("Это не машина");
            }
        }


        protected String[] loadWheelNamesFromDB()
        {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }
}