package com.javarush.test.level36.lesson04.big01.controller;

import com.javarush.test.level36.lesson04.big01.model.Model;
import com.javarush.test.level36.lesson04.big01.view.EditUserView;
import com.javarush.test.level36.lesson04.big01.view.UsersView;

/**
 * Created by Влад on 20.09.2015.
 */
public class Controller
{
    Model model;
    private UsersView usersView;
    EditUserView editUserView;

    public void setEditUserView(EditUserView editUserView)
    {
        this.editUserView = editUserView;
    }

    public void setModel(Model model)
    {
        this.model = model;
    }

    public void onShowAllUsers()
    {

        model.loadUsers();
        usersView.refresh(model.getModelData());

    }

    public void setUsersView(UsersView usersView)
    {
        this.usersView = usersView;
    }

    public UsersView getUsersView()
    {
        return usersView;
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }

    public void onOpenUserEditForm(long userId) {
        model.loadUserById(userId);
        editUserView.refresh(model.getModelData());
    }
}
