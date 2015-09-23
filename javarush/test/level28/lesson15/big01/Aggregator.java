package com.javarush.test.level28.lesson15.big01;


import com.javarush.test.level28.lesson15.big01.model.HHStrategy;
import com.javarush.test.level28.lesson15.big01.model.LinkedInStrategy;
import com.javarush.test.level28.lesson15.big01.model.Model;
import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.view.HtmlView;


public class Aggregator
{
    public static void main(String[] args) {

        HtmlView view = new HtmlView();

        Provider HHstrategy = new Provider(new HHStrategy());

        Model model = new Model(view, HHstrategy);

        Controller controller = new Controller(model);

        view.setController(controller);

        System.out.println("Wait a little, gathering info . . .");
        view.userCitySelectEmulationMethod();
        System.out.println("Here is results: " +
                "result.html");
    }
}

