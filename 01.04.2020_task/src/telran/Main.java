package telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5,7,8, 12, 17, 20};
        shiftLeft(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void shiftLeft(int[] numbers){
        int temp = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = temp;
    }

}