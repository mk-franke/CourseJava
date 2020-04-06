package telran.guessNumber;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Please, enter a range for the game");
        int range1 = scanner.nextInt();
        int range2 = scanner.nextInt();
        guessNumber(range1, range2);

        System.out.println();
        System.out.println("Please, enter 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        multiple2NumbersCompareWith3 (a, b, c);

        scanner.close();

    }

    public static void guessNumber(int a, int b) {
        System.out.println("Guess the number");
        int number = (int) (a + Math.random() * (b-a+1));
        while (true) {
            System.out.println("My number is from " + a + " to " + b);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Bingo!!!");
                break;
            } else if (inputNumber > number) {
                System.out.println("My number is less");
            } else {
                System.out.println("My number is bigger");
            }
        }
    }

    public static void multiple2NumbersCompareWith3 (int a, int b, int c){
        int res = a*b;
        if(res<c){
            System.out.println("Number " + c + " is bigger then the multiply of " + a + " and " + b);
        } else if(res>c){
            System.out.println("Number " + c + " is smaller then the multiply of " + a + " and " + b);
        } else {
            System.out.println("Number " + c + " is equal to the multiply of " + a + " and " + b);
        }
    }

}


