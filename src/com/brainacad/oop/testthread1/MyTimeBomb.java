package com.brainacad.oop.testthread1;

/**
 * Created by User on 15.02.2018.
 */
public class MyTimeBomb extends Thread {
    public void run() {
        System.out.println("The bomb will explode through: ");

        for (int i = 10; i > 0; i--) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Boom!!!");
    }
}
