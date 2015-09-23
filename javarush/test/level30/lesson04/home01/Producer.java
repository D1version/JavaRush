package com.javarush.test.level30.lesson04.home01;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable
{
    private TransferQueue<ShareItem> queue;

    public Producer(TransferQueue<ShareItem> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 9 ; i++)
        {
                System.out.printf("Элемент 'ShareItem-%d' добавлен\n", i+1);
                queue.offer(new ShareItem(String.format("ShareItem-%d", i+1), i+1));
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e){return;}
            if (queue.hasWaitingConsumer()){
                System.out.println("Consumer в ожидании!");
            }
        }
    }
}
