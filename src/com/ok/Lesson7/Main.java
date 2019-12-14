package com.ok.Lesson7;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String>  stringStream = Stream.of("a","a","bx", "c");

        stringStream
                .map(s -> s.toUpperCase())
                .limit(1)
                .filter(s -> s.length() == 1 )
                .distinct()
                .forEach(System.out::println);
  //              .collect(Collectors.toList());

        List<String> collect = stringStream
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() == 1 )
                .distinct()
                .collect(Collectors.toList());



        List <Integer> integers =  Arrays.asList(1,2,3,4,5,6);

        integers.stream().map(s-> s+2).filter(s->s%2 == 0).forEach(System.out::println);


        Person p = null;
        Optional<Person> optionalPerson = Optional.ofNullable(p);
        System.out.println(optionalPerson.orElse(new Person()));

        Consumer<String> consumer  = (String s) -> System.out.println(s);
        Supplier<String> supplier = () ->"";


    }
}
