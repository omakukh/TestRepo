package com.ok.Lesson3.AdditionalTasks;

public class IntegerArray extends Array {

    public IntegerArray(int[] intArr){
        super(intArr);
    }

    public IntegerArray(){}

    public int allElementsSum(){
        int sum = 0;
        int[] tmpArray = getArray();
        for (int tmp: tmpArray){
            sum = sum + tmp;
        }
        return sum;
    }

    public double averageSum(){
        double avg = 0;
        int[] tmpArray = getArray();
        if (tmpArray.length > 0) {
            avg = (double)(allElementsSum() / tmpArray.length);
        }
        return avg;
    }

    public int evenElementsSum(){
        int sum = 0;
        int[] tmpArray = getArray();
        for (int element:tmpArray) {
            if (element % 2 == 0){
                sum = sum + element;
            }
        }
        return sum;
    }
}
