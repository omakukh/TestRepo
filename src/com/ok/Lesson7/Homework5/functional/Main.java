package com.ok.Lesson7.Homework5.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> arrayOfStrings = Arrays.asList("summer", "autumn", "spring", "winter" , "autumn again", "autumn", "spring", "Autumn1");
        arrayOfStrings.stream()
                .filter(s -> s.contains("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        List <Integer> arrayOfIntegers = Arrays.asList(-6,3,5,-6,56,89,-56, 0, -4,66,77);
        arrayOfIntegers.stream()
                .filter(i -> i%2 == 0)
                .distinct()
                .limit(2)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

}
