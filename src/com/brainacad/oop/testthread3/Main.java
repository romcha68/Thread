package com.brainacad.oop.testthread3;

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
        mySumCount2.setStartIndex(500);

        mySumCount1.setStopIndex(700);
        mySumCount2.setStopIndex(900);

        mySumCount1.setMyArray(myArray);
        mySumCount2.setMyArray(myArray);

        mySumCount1.start();
        mySumCount2.start();

        try {

            mySumCount1.join();
            mySumCount2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("Sum1 of array element: " + mySumCount1.getResultSum());
        System.out.println("Sum2 of array element: " + mySumCount2.getResultSum());


    }
}
