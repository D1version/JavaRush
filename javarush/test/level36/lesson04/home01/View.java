package com.javarush.test.level36.lesson04.home01;

/**
 * Created by Влад on 20.09.2015.
 */
public class View
{
    private Controller controller = new Controller();
    public void fireEventShowData() {
        System.out.println(controller.onDataListShow());
    }
}
