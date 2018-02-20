package com.brainacad.oop.testthread3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 19.02.2018.
 */
public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private long resultSum;

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getMyArray() {
        return this.myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return this.resultSum;
    }

    @Override
    public void run() {
        this.resultSum = 0;
        for (int i = this.startIndex; i < this.stopIndex; i++) {
            this.resultSum += this.myArray[i];

        }
    }


}
