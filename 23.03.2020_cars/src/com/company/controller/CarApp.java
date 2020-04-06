package com.company.controller;

import com.company.dao.CarFleet;
import com.company.data.Car;
import com.company.data.Color;
import com.company.data.Dimension;
import com.company.data.Engine;

public class CarApp {

    public static void main(String[] args) {

        Engine engine1 = new Engine( 3, "R6", "Benzin", "rear-wheel", "automatic");
        Engine engine2 = new Engine(3, "R6", "Benzin", "four-wheel", "automatic");
        Engine engine3 = new Engine((float) 4.4, "V8", "Benzin", "four-wheel", "automatic");

        Dimension dimension1 = new Dimension(4936, 1868, 1466,	1770);
        Dimension dimension2 = new Dimension(4633,1811, 1429,	1690);
        Dimension dimension3 = new Dimension(5260, 1902, 1479,	2075);

        Car car1 = new Car("Audi", "RS6", 2016, Color.BLUE);
        Car car2 = new Car("BMW", "5", 2018, Color.WHITE, engine1, dimension1);
        Car car3 = new Car("BMW", "3", 2020, Color.BLACK, engine2, dimension2);
        Car car4 = new Car("BMW", "7", 2019, Color.BLACK, engine3, dimension3);
        Car car5 = new Car("Mercedes-Benz", "S Class", 2018, Color.BLACK);
        Car car6 = new Car("Mercedes-Benz", "G Class", 2016, Color.BLACK);
        Car car7 = new Car("Volvo", "S 60", 2015, Color.GREY);
        Car car8 = new Car("Land Rover", "Range Rover Sport", 2016, Color.BLUE);
        Car car9 = new Car("Volkswagen", "Golf", 2020, Color.GREY);
        Car car10 = new Car("Toyota", "Land Cruiser 200", 2015, Color.BLACK);

        CarFleet myCarFleet = new CarFleet(50);
        myCarFleet.addCar(car1);
        myCarFleet.addCar(car2);
        myCarFleet.addCar(car3);
        myCarFleet.addCar(car4);
        myCarFleet.addCar(car5);
        myCarFleet.addCar(car6);
        myCarFleet.addCar(car7);
        myCarFleet.addCar(car8);
        myCarFleet.addCar(car9);
        myCarFleet.addCar(car10);

        myCarFleet.display();
        System.out.println("-----------------------");
        myCarFleet.displayCarByColor(Color.BLACK);
        System.out.println("-----------------------");
        myCarFleet.displayCarByColor(Color.YELLOW);
        System.out.println("-----------------------");
        System.out.println(myCarFleet.getNewestCar());
        System.out.println("-----------------------");
        myCarFleet.getBrandCount("BMW");

    }

}
