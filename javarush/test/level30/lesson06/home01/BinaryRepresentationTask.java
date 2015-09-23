package com.javarush.test.level30.lesson06.home01;


import java.util.concurrent.RecursiveTask;
public class BinaryRepresentationTask extends RecursiveTask<String>
{
    private int i;
    public BinaryRepresentationTask(int i)
    {
        this.i = i;
    }
    @Override
    protected String compute()
    {
        int a = i % 2;
        int b = i / 2;
        String result = String.valueOf(a);

        if (b > 0)
        {
            BinaryRepresentationTask task = new BinaryRepresentationTask(a);
            task.fork();
            return new BinaryRepresentationTask(b).compute() + task.join();
        }
        return result;
    }
}
