package com.ok.Lesson3.AdditionalTasks;

public class MainForArrays {
    public static void main(String[] args) {
        System.out.println("Array class usage: ");
        Array common = new Array(new int[]{5,-1,4,0,7,8,43,26,100});
        common.printArray();
        common.addArrayElement(110);
        common.addArrayElement(new int[]{111,112,115});
        common.printArray();
        System.out.println("Sum of odd indexes of array: " + common.oddIndexesSum());
        System.out.println();

        Array common2 = new Array();
        common2.printArray();
        common2.addArrayElement(110);
        common2.addArrayElement(new int[]{111,112,115});
        common2.printArray();
        System.out.println("Sum of odd indexes of array: " + common2.oddIndexesSum());
        System.out.println();

        System.out.println("IntegerArray class usage: ");
        IntegerArray intArray = new IntegerArray(new int[]{4,-2,-3,66,-84,5});
        intArray.printArray();
        System.out.println("Sum of all array elements: " + intArray.allElementsSum());
        System.out.println("Average value of all array elements: " + intArray.averageSum());
        System.out.println("Sum of even array elements: " + intArray.evenElementsSum());
        System.out.println();

        IntegerArray intArray2 = new IntegerArray();
        intArray2.addArrayElement(new int[]{4,5,6,7,0});
        intArray2.printArray();
        System.out.println();

        System.out.println("CharArray class usage: ");
        CharArray chArray = new CharArray(new char[]{'l','i','t','s'});
        chArray.printArray();
        chArray.ifCharExists('i');
        chArray.ifCharExists('y');
        chArray.addArrayElement('-');
        chArray.printArray();
        chArray.addArrayElement(new char[]{'f', 'o', 'r',' ', 'k', 'i', 'd', 's'});
        chArray.printArray();
        chArray.printArrayOfChars();

        CharArray charArray = new CharArray();
        charArray.printArrayOfChars();
        charArray.addArrayElement(new char[]{'Q', 'A', ' ', 'S', 'c', 'h', 'o', 'o', 'l'});
        charArray.printArrayOfChars();
    }

}
