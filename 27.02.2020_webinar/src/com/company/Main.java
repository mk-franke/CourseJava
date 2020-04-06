package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person ("Olga", 20);
//        person1.name = "Olga";
//        person1.age = 20;

        Person person2 = new Person ("Nick", 21);
//        person2.name = "Nick";
//        person2.age = 21;

        Person person3 = new Person ("Sveta", 24);
//        person3.name = "Sveta";
//        person3.age = 24;

        person1.print ();
        person2.print ();
        person3.print ();

        Person person4 = new Person ("Oleg", 30);
//        person4.setPersonField("Oleg", 30);

        Person person5 = new Person ("Ivan", 25);

        Person[] persons = {person1, person2, person3, person4, person5};
        System.out.println(persons.length);
        printPersonArray(persons);


        Date date1 = new Date (10, 10, 2020);
        date1.print();
        System.out.println(date1.isCorrect());
        System.out.println("Day is " + date1.getDay());

        Date date2;
        date2 = date1.getRandomDate();
        date2.print();

    }

    public static void printPersonArray (Person[] persons){
        for (int i=0; i<persons.length; i++){
            persons[i].print();
        }
    }

}
