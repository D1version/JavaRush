package com.javarush.test.level36.lesson04.big01.model;

import com.javarush.test.level36.lesson04.big01.bean.User;

import java.util.Arrays;


/**
 * Created by Влад on 20.09.2015.
 */
public class FakeModel implements Model
{
    ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData()
    {
        return modelData;
    }

    @Override
    public void loadUsers()
    {
        modelData.setUsers(Arrays.asList(new User[]{new User("A", 1, 1),
                new User("B", 2, 1),
                new User("C", 3, 2),
                new User("D", 4, 3)}));
    }

    @Override
    public void loadDeletedUsers()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId)
    {
        throw new UnsupportedOperationException();
    }
}
