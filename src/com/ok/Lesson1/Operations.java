package com.ok.Lesson1;

public class Operations {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 4;
        int d = 8;
        int e = 3;

        System.out.println("(a + b) / (d - b) * 2 = " + ((a + b) / (d - b) * 2));

        System.out.println("a + 2 * 2 - 12 / a * (b - c) = " + (a + 2 * 2 - 12 / a * (b - c)));

        System.out.println("b + 11 * c - a = " + (b + 11 * c - a));

        System.out.println("a * (c + b + d) - e / 1 + a = " + (a * (c + b + d) - e / 1 + a));

        System.out.println("a + b * (a - b) / 12 = " + (a + b * (a - b) / 12));

    }
}
