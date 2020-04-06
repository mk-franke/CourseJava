package com.telran.project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        int a = 10;
        System.out.println(a);
        System.out.println(a + " This is a number " + a);
        System.out.println(a + "10");
        System.out.println(a + a);

        float f = 3.15f;
        long b = 4637484758832L;

        boolean boo = 2>3;
        System.out.println(boo);

        int height = 175;

        if(height>200){
            System.out.println("Go home");
        }else if(height<150){
            System.out.println("Go chill");
        }else{
            System.out.println("Go to work");
        }

        powerXY(3,3);
        fan(2);
        army(12);

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please, enter your age: ");
        age = scanner.nextInt();
        army(age);
    }

    private static void powerXY(int x, int y){
        int res = 1;
        for(int i = 1; i<=y; i++){
            res *= x;
        }
        System.out.println(x + " power " + y +  " is " + res);
    }

    private static void fan(int mode){
        switch(mode){
            case 0:
                System.out.println("fan is off");
                break;
            case 1:
                System.out.println("fan is on min mode");
                break;
            case 2:
                System.out.println("fan is on max mode");
                break;
            default:
                System.out.println("wrong mode");
        }
    }

    private static void army(int age){
        if(age<18){
            System.out.println("Too young for the army for now");
        }if(age>=18 && age<27){
            System.out.println("You need to go to the army");
        }else if(age>=27){
            System.out.println("Too old for the army");
        }
    }

}
