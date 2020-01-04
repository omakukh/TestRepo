package com.ok.Lesson3.AdditionalTasks;

public class Array {

    private int[] customArray = new int[]{};

    public Array(int[] customArray){
        this.customArray = customArray;
    }

    public Array(){}

    public int[] getArray(){
        return customArray;
    }

    public void printArray(){
        if (customArray.length > 0) {
            System.out.print("Array has the following elements: ");
            for (int temp:customArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        } else {
            System.out.println("Array has no elements");
        }
    }

    public void addArrayElement(int newArrayElement){
        int[] tmpArray = new int[customArray.length+1];
        for (int i = 0; i < customArray.length; i++){
            tmpArray[i] = customArray[i];
        }
        tmpArray[customArray.length] = newArrayElement;
        customArray = tmpArray;
    }

    public void addArrayElement(int[] arrayElements){
        int l = customArray.length + arrayElements.length;
        int[] tmpArray = new int[l];
        for (int i = 0; i < customArray.length; i++){
            tmpArray[i] = customArray[i];
        }
        for (int i = customArray.length; i < tmpArray.length; i++){
            tmpArray[i] = arrayElements[i - customArray.length];
        }
        customArray = tmpArray;
    }

    public int oddIndexesSum(){
        int sum = 0;
        for (int i = 0; i < customArray.length; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

}
