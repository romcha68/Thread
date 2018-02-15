package com.brainacad.oop.testthread2;

/**
 * Created by User on 15.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb2 bomb1 = new MyTimeBomb2();
        Thread thread = new Thread(bomb1);
        thread.start();
    }
}
