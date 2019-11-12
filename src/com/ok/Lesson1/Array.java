package com.ok.Lesson1;

public class Array {

    public static void main(String[] args) {

        int[] array1 = {15, 6, 8, 9, 0, 24, 56};
        String dividedBy2 = "Numbers can be divided by 2: ";
        String dividedBy3 = "Numbers can be divided by 3: ";
        String dividedBy5 = "Numbers can be divided by 5: ";
        String dividedBy7 = "Numbers can be divided by 7: ";

        for (int arr_val : array1) {
            if (arr_val % 2 == 0) {

                dividedBy2 = dividedBy2 + arr_val + " ";
//              System.out.println(" Number can be divided by 2: " + arr_val + " ");

            }

            if (arr_val % 3 == 0) {

                dividedBy3 = dividedBy3 + arr_val + " ";
//              System.out.println(" Number can be divided by 3: " + arr_val + " ");

            }

            if (arr_val % 5 == 0){

                dividedBy5 = dividedBy5 + arr_val + " ";

            }

            if (arr_val % 7 == 0){

                dividedBy7 = dividedBy7 + arr_val + " ";
            }
        }

        System.out.println(dividedBy2);
        System.out.println(dividedBy3);
        System.out.println(dividedBy5);
        System.out.println(dividedBy7);

    }
}
