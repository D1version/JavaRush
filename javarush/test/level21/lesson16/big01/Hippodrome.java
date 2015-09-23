package com.javarush.test.level21.lesson16.big01;


import java.util.ArrayList;

public class Hippodrome
    {
        static ArrayList<Horse> horses = new ArrayList<>();

        public ArrayList<Horse> getHorses(){
            return horses;
        }
        public static Hippodrome game;
        public void run() throws InterruptedException
        {
            for (int i = 1; i <= 100 ; i++)
            {
                move();
                print();
                Thread.sleep(500);
            }
        }

        public void move()
        {
            for (int i = 0; i < horses.size(); i++)
            {
                horses.get(i).move();
            }
        }

        public void print()
        {
            for (int i = 0; i < horses.size(); i++)
            {
                horses.get(i).print();
            }
            System.out.println();
            System.out.println();
        }

        public Horse getWinner()
        {
            Horse h = horses.get(0);
            for (int i = 1; i < horses.size(); i++)
            {
                if(h.distance < horses.get(i).distance) h = horses.get(i);
            }
            return h;
        }

        public void printWinner()
        {
            System.out.println("Winner is " + getWinner().getName() + "!");
        }

        public static void main(String[] args) throws InterruptedException
        {
            Hippodrome hippodrome = new Hippodrome();
            game = hippodrome;
            Horse horse1 = new Horse("Olen'",3,0);
            Horse horse2 = new Horse("Vasilis",3,0);
            Horse horse3 = new Horse("Melodic",3,0);
            horses.add(horse1);
            horses.add(horse2);
            horses.add(horse3);
            game.run();
            game.printWinner();
        }

}

