package com.javarush.test.level27.lesson15.big01.kitchen;



import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer
{
    public String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }


    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin", arg.toString(), ((Order) arg).getTotalCookingTime()));
        setChanged();
        notifyObservers(arg);
    }
}
