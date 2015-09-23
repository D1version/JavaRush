package com.javarush.test.level27.lesson15.big01.kitchen;


import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
        import com.javarush.test.level27.lesson15.big01.Tablet;

        import java.io.IOException;
        import java.util.List;

public class Order
{
    private Tablet tablet;
    private List<Dish> dishes;

    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString()
    {
        if (dishes.isEmpty() || dishes == null)
            return "";
        else return "Your order: " + dishes + " of " + tablet;
    }
    public boolean isEmpty(){
        return dishes == null || dishes.isEmpty();
    }

    public int getTotalCookingTime(){
        int count = 0;
        for (Dish dish :dishes ) {
            count += dish.getDuration();
        }

        return count;
    }
}

