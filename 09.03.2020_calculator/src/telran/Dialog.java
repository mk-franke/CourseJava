package telran;

import java.util.Scanner;

public class Dialog {

    static Scanner scanner = new Scanner(System.in);

    public static double getParameter(){
        System.out.println("Enter a number");
        double a = scanner.nextDouble();
        return a;
    }

    public static char operationChoice(){
        System.out.println("Enter an operation symbol (+,-,*,/)");
        char operation = scanner.next().charAt(0);
        while(operation!='+' && operation!='-' && operation!='*' && operation!='/'){
            System.out.println("Error! Wrong operator! Enter a right operator.");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

}
