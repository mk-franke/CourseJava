package telran.application;

import telran.data.Car;
import static telran.data.Car.*;

public class CarApplication {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "5er", "black", 2020);
        Car car2 = new Car("Mercedes-Benz", "E", "white", 2017);
        Car car3 = new Car("Porsche", "Cayenne", "black", 2018);
        Car car4 = new Car("Porsche", "911", "yellow", 2019);
//        Car.wheels = 5;

        Car[] cars = new Car[]{car1, car2, car3, car4};
        printArrayCar(cars);

        System.out.println();
        sortCarsByYear(cars);
        printArrayCar(cars);
        System.out.println();
        sortCarsWithComparator(cars);
        printArrayCar(cars);
        System.out.println();
        sortCarsWithComparator2(cars);
        printArrayCar(cars);

    }

}
