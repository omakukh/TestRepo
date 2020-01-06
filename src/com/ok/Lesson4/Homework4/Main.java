package com.ok.Lesson4.Homework4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.print("Input 1 - to see StackOverflowError or 2 - to see OutOfMemoryError: ");
        int i = myInput.nextInt();

        try {
            if (i == 1){
              new ProduceStackOverflowError().produceError();
            } else if (i == 2) {
                byte[] arr = new byte[Integer.MAX_VALUE];
            } else {
                System.out.println("Wrong choice");
            }
        } catch (Error e){
            e.printStackTrace();
            System.out.println("Bingo");
        }
    }



}
