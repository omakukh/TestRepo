package com.ok.Lesson3.AdditionalTasks;

public class CharArray extends Array {

    CharArray(char[] charArr) {
        super.addArrayElement(charsToInts(charArr));
    }

    CharArray(){}


    public void ifCharExists(char charToCheck){
        int count = 0;
        for (int tmpValue:getArray()) {
            if (tmpValue == charToCheck){
                count++;
            }
        }
        if (count != 0){
            System.out.println("Char " + charToCheck + " is found in array " + count + " times");
        } else {
            System.out.println("Char " + charToCheck + " is not found in array");
        }
    }

    public void addArrayElement(char[] arrayElements){
        addArrayElement(charsToInts(arrayElements));
    }


    public void printArrayOfChars(){
            if (getArray().length > 0) {
                System.out.print("Array has the following elements: ");
                for (int temp:getArray()) {
                    System.out.print((char) temp + " ");
                }
                System.out.println();
            } else {
                System.out.println("Array has no elements");
            }

    }

    private int[] charsToInts(char[] charArr){
        int[] tmp = new int[charArr.length];
        for (int i = 0; i < tmp.length; i++){
            tmp[i] = charArr[i];
        }
        return tmp;
    }
}
