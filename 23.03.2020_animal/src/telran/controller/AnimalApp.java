package telran.controller;

import telran.data.*;

public class AnimalApp {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Tiger", 4, "M", "Black-orange");
        Object animal2 = new Animal("Elephant", 13, "F", "Grey");
        Animal animal3 = new Pet("Dog", 5, "M", "Brown");
        Animal animal4 = new WildAnimal("Deer", 8, "F", "brown", "forest", 573645);
        Pet animal5 = new Pet("Cat", 3, "F", "White", "Murzik", "Roman");

        System.out.println(animal1.getClass());
        System.out.println(animal3.getClass());
        System.out.println(animal4.getClass());
        System.out.println();

        animal3 = (Pet)animal3;

        animal1.run();
        animal4.run();
        animal4 = (WildAnimal)animal4;
        ((WildAnimal) animal4).migration();
        animal5.play();
        animal5.run();

        Dog dog1 = new Dog(4, "Sharik");
        Cat cat1 = new Cat(5);
        AnimalAbstract dog2 = new Dog(2, "Tuzik");
        cat1.setName("Murzik");
        AnimalAbstract[] animals = {dog1, dog2, cat1};

        System.out.println();
        for (AnimalAbstract a: animals) {
            a.voice();
        }
        System.out.println();
        for (AnimalAbstract a: animals) {
            a.play();
        }
        System.out.println();
        for (AnimalAbstract a: animals) {
            System.out.println(a);
        }

    }

}
