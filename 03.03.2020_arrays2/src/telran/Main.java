package telran;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[getSizeArray()];
        fillArray(arr);
        printArray(arr);
        System.out.println();
        int numberToDelete= getNumberToDelete();
        boolean check = checkNumber(arr, numberToDelete);
        printResult(arr, numberToDelete, check);

        scanner.close();
    }

    public static int getSizeArray(){
        System.out.println("Enter size of array");
        return scanner.nextInt();
    }

    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int num: array) {
            System.out.print(num + " ");
        }
    }

    public static int getNumberToDelete(){
        System.out.println("Enter a number to delete");
        return scanner.nextInt();
    }

    public static int[] getArrayWithoutNumber(int[] array, int number){
        int[] newArray = new int[array.length - 1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!= number){
                newArray[index++] = array[i];
            }
        }
        return newArray;
    }

    public static boolean checkNumber(int[] array, int number){
        for (int num: array) {
            if(num==number){
                return true;
            }
        }
        return false;
    }

    public static void printResult(int[] array, int number, boolean check){
        if(check){
            System.out.println("Yes");
            printArray(getArrayWithoutNumber(array, number));
        }else{
            System.out.println("No such number in array, nothing to delete");
        }
    }

}
