package telran.homework;

import static  java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        int size = 20;
        int[] arr = new int[size];
        fillArray(arr);
        printArray(arr);
        System.out.println();
        System.out.println("Max number in array is " + findMaxNumber(arr));

    }

    public static void fillArray(int [] array){
        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*20);
        }
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static int findMaxNumber(int[] array){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber = maxNumber < array[i] ? array[i]:maxNumber;
        }
 /*     for (int value : array) {
            maxNumber = max(maxNumber, value);
        }*/
        return maxNumber;
    }

}
