package com.ok.Lesson2.Homework2;

public class Main {

    public static void main(String[] args) {

        Array arr1 = new Array();
        Array arr2 = new Array(new int[]{-5, 8, 0, -6, 9});

//        Array arr3 = new Array();
//        arr1.setArray(new int[]{0});
//        arr3.setArray(null);

        System.out.println("Average Sum: " + arr2.getAverageSum());
        System.out.println("Arr2 MAX value: " + arr2.getArrayMaxValue());
        System.out.println("Arr2 MIN value: " + arr2.getArrayMinValue());

        arr1.setArray(arr2.getArrayOfEvenValues());
        System.out.print("Array of even values: ");
        arr1.printArray();
        System.out.println();

        arr1.setArray(arr2.getArrayOfOddValues());
        System.out.print("Array of odd values: ");
        arr1.printArray();
        System.out.println();

        arr1.setArray(arr2.getIndexesOfEvenValues());
        System.out.print("Array of indexes of even values: ");
        arr1.printArray();

//        arr3.printArray();
    }
}
