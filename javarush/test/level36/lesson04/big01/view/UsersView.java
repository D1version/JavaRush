package com.javarush.test.level36.lesson04.big01.view;

import com.javarush.test.level36.lesson04.big01.bean.User;
import com.javarush.test.level36.lesson04.big01.controller.Controller;
import com.javarush.test.level36.lesson04.big01.model.ModelData;

/**
 * Created by Влад on 20.09.2015.
 */
public class UsersView implements View
{
    private Controller controller;

    @Override
    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        if (modelData.isDisplayDeletedUserList() == true)
            System.out.println("All deleted users:");
        else
            System.out.println("All users:");
        for (User it: modelData.getUsers()) {
            System.out.println("\t" + it.toString());
        }
        System.out.println("===================================================");
    }

    public void fireEventShowAllUsers()
    {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers()
    {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }
}
