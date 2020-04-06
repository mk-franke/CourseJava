package com.company;

public class Manager extends Employee{

    public Manager(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + '}';
    }

    @Override
    public String getName() {
        return "sir" + super.getName();
    }

    public void doWork(){
//        System.out.println(this.getName());
        System.out.println("I'm a manager. I say other what they have to do");
    }

    public void pay(){
        System.out.println("I've got a salary - " + (((super.getExperience() < 5 ? this.getSalary() : this.getSalary()+3000))));
    }

}
