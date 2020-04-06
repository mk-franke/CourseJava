package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Nick", 1000);
        System.out.println(employee1);
        employee1.doWork();
        employee1.pay();

        System.out.println("-----------------------");
        Manager manager1 = new Manager("Jack", 2000);
        System.out.println(manager1);
        System.out.println(manager1.getName());
        manager1.doWork();
        manager1.pay();

        System.out.println("-----------------------");
        Programmer programmer1 = new Programmer("John", 1500, 10);
        System.out.println(programmer1);
        System.out.println(programmer1.getName());
        programmer1.doWork();
        programmer1.pay();

        System.out.println("-----------------------");
        Employee[] employees = {employee1, programmer1, manager1};
        for (int i = 0; i < employees.length; i++) {
            employees[i].pay();
        }

    }

}
