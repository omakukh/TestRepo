package com.ok.Lesson1;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {15, 6, 9, 8, 0, 56, 24};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}
