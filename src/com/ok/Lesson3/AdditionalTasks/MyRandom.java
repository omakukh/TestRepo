package com.ok.Lesson3.AdditionalTasks;

import java.util.Random;

public class MyRandom {

    public void printRandomChars() {
        Random rand = new Random();
        System.out.println("There are the following random chars:");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (rand.nextInt(95) + 32) + " ");
        }
        System.out.println();

    }

    public void evenNumberSum() {
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers in a range [1-15] is: " + sum);
    }

    public void randomNumberDivision() {
        Random rand = new Random();
        int tmp = rand.nextInt();
        if (tmp % 3 == 0) {
            System.out.println("Number " + tmp + " is divided by 3");
        } else if (tmp % 5 == 0) {
            System.out.println("Number " + tmp + " is divided by 5");
        } else if (tmp % 7 == 0) {
            System.out.println("Number " + tmp + " is divided by 7");
        } else {
            System.out.println("Number " + tmp + " is not divided by 3, 5, 7");
        }
    }

    public void randomNumberCycle() {
        Random rand = new Random();
        long sum = 0;
        System.out.println("Random int numbers divided by 7 are: ");
        for (int i = 0; i < 50; i++) {
            int tmp = rand.nextInt();
            if (tmp % 7 == 0) {
                System.out.print(tmp + " ");
                sum = sum + tmp;
            }
        }
        System.out.println("\nSum of random numbers divided by 7 is: " + sum);
    }

    public void randomNumberAverage() {
        Random rand = new Random();
        long sum = 0;
        long avg = 0;
        System.out.println("Random 15 int numbers are: ");
        for (int i = 0; i < 15; i++) {
            int tmp = rand.nextInt();
            System.out.print(tmp + " ");
            sum = sum + tmp;
        }
        avg = sum / 15;
        System.out.println("\nAverage value of 15 random values is: " + avg);
    }

}