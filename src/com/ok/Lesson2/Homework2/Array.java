package com.ok.Lesson2.Homework2;

import java.util.Arrays;

public class Array {

    private int[] arr = new int[]{};

    public Array() {

    }

    public Array(int[] arr) {

        this.arr = arr;

    }

    public double getAverageSum() {
        checkArrayCorrectness();

        double sum = 0;

        for (int arrayElement : arr) {
            sum = sum + arrayElement;
        }

        return sum / arr.length;

    }

    public int getArrayMaxValue() {
        checkArrayCorrectness();

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;

    }

    public int getArrayMinValue() {
        checkArrayCorrectness();

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;

    }

    public int[] getArrayOfEvenValues() {
        checkArrayCorrectness();

        int[] arrayOfEvenValues = new int[arr.length];
        int j = 0;

        for (int arrayElement : arr) {
            if (arrayElement % 2 == 0) {
                arrayOfEvenValues[j] = arrayElement;
                j++;
            }
        }

        return Arrays.copyOfRange(arrayOfEvenValues, 0, j);

    }


    public int[] getArrayOfOddValues() {
        checkArrayCorrectness();

        int[] arrayOfOddValues = new int[arr.length];
        int j = 0;

        for (int arrayElement : arr) {
            if (arrayElement % 2 != 0) {
                arrayOfOddValues[j] = arrayElement;
                j++;
            }
        }

        return Arrays.copyOfRange(arrayOfOddValues, 0, j);

    }

    public int[] getIndexesOfEvenValues() {
        checkArrayCorrectness();

        int[] arrayOfIndexes = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrayOfIndexes[j] = i;
                j++;
            }
        }

        return Arrays.copyOfRange(arrayOfIndexes, 0, j);

    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        checkArrayCorrectness();
        for (int arrayElement : arr) {
            System.out.print(arrayElement + " ");
        }

    }

    private void checkArrayCorrectness() {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Array is NULL or empty");
        }
    }
}
