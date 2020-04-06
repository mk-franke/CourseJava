package com.company;

public class Programmer extends Employee{

    public Programmer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() + '}';
    }

    public void doWork(){
        System.out.println("Programmer: I do my work");
    }

    public void pay(){
        System.out.println("I've got a salary - " + (((super.getExperience() < 5 ? this.getSalary() : this.getSalary()+3000))));
    }

}
