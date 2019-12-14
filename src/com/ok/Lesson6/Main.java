package com.ok.Lesson6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList();

        for (int i=0; i < 5; i++){
            arrList.add(i+"");
            System.out.println(arrList.get(i));
        }

        String[] arrName = new String[]{"Mike", "Jhon"};

        for (int i = 0; i < arrName.length; i++){
            arrList.add(arrName[i]);
        }

        System.out.println(arrList);


        LinkedList<String> lnkdList = new LinkedList<>();
        lnkdList.add("Ivan");
        lnkdList.add("Oleh");
        lnkdList.add("Roman");

        System.out.println(lnkdList);

        while (lnkdList.size()>0){
            System.out.println(lnkdList.getLast());
            lnkdList.removeLast();
        }


        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();

        for (int i=0;i<20;i++){
            numbers.add(random.nextInt(100));
        }

        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("Numbers: " + numbers);


        Person p1 = new Person("Max", 12);
        Person p2 = new Person("Max", 14);
        Person p3 = new Person("Max", 15);


        TreeSet<Person> sortedPeople = new TreeSet<>();
        sortedPeople.add(p1);
        sortedPeople.add(p2);
        sortedPeople.add(p3);

        System.out.println(sortedPeople);



    }
}
