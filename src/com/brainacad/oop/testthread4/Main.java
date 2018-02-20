package com.brainacad.oop.testthread4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 19.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];

        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();

        Random randomGenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(1000);
        }


        mySumCount1.setStartIndex(5);
        mySumCount1.setStopIndex(700);

        mySumCount2.setStartIndex(500);
        mySumCount2.setStopIndex(900);

        mySumCount1.setMyArray(myArray);
        mySumCount2.setMyArray(myArray);

        Thread thread1 = new Thread(mySumCount1);
        Thread thread2 = new Thread(mySumCount2);

        thread1.start();
        thread2.start();

        System.out.println("MyArray: " + Arrays.toString(myArray));
        System.out.println("Sum1 of array element: " + mySumCount1.getResultSum());
        System.out.println("Sum2 of array element: " + mySumCount2.getResultSum());
    }
}

