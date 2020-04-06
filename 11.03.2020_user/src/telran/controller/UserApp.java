package telran.controller;

import java.util.Scanner;
import telran.data.User;

public class UserApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        User user1 = new User("Gena", 3457);
        User user2 = new User("Vasya", 3422);
        User user3 = new User("Luisa", 9791);
        User user4 = new User("Martin", 6852);
        User user5 = new User("John", 8933);

        User[] users = new User[]{user1, user2, user3, user4, user5};
        String nameUser = getNameFromUser();
        userCollaboration(users, nameUser);

        scanner.close();
    }

    public static String getNameFromUser() {
        System.out.println("Please, enter your name");
        String userName = scanner.nextLine();
        return userName;
    }

    public static int operationChoice() {
        System.out.println("If you want to get your secret code, please, enter 1");
        System.out.println("If you want to change your name, please, enter 2");
        int operation = scanner.nextInt();
        return operation;
    }

    public static void updateUser(User user) {
        System.out.println("Please, enter your code to confirm the name change");
        int code = scanner.nextInt();
        if(user.checkSecretCode(code)){
            System.out.println("Please, enter your new name");
            String newName = scanner.next();
            user.setName(newName);
            System.out.println("Your new name is " + user.getName() + " now");
        } else {
            System.out.println("Access denied, wrong secret code!");
        }
    }

    public static void commitUserOperationChoice(int operation, User user) {
        switch (operation) {
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUser(user);
                break;
            default:
                System.out.println("Error! Wrong operation!");
        }
    }

    public static void userCollaboration(User[] users, String name) {
        if (User.getUserByName(users, name) == null) {
            System.out.println("Access denied");
        } else {
            System.out.println("Hello dear " + name + "!");
            int operation = operationChoice();
            commitUserOperationChoice(operation, User.getUserByName(users, name));
        }
    }

}


