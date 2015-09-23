package com.javarush.test.level36.lesson04.big01.model;

import com.javarush.test.level36.lesson04.big01.bean.User;

import java.util.List;

/**
 * Created by Влад on 20.09.2015.
 */
public class ModelData
{
    List<User> users;
    User activeUser;
    boolean displayDeletedUserList;

    public void setDisplayDeletedUserList(boolean displayDeletedUserList)
    {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public boolean isDisplayDeletedUserList()
    {

        return displayDeletedUserList;
    }

    public void setActiveUser(User activeUser)
    {
        this.activeUser = activeUser;
    }

    public User getActiveUser()
    {

        return activeUser;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }

    public List<User> getUsers()
    {

        return users;
    }
}
