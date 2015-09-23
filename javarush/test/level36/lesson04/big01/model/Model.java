package com.javarush.test.level36.lesson04.big01.model;

/**
 * Created by Влад on 20.09.2015.
 */
public interface Model
{
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();

    void loadUserById(long userId);
}
