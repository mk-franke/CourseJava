package com.company.dao;

import com.company.data.Car;
import com.company.data.Color;

public class CarFleet {

    private Car[] cars;
    private int size;

    public int getSize() { return size; }

    public CarFleet(int capacity){
        cars = new Car[capacity];
        size = 0;
    }

    public boolean addCar(Car car){
        if (size<cars.length){
            cars[size] = car;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCar(Car car){
        System.out.println("You have " + size + " cars in your fleet");
        for (int i = 0; i < size; i++) {
            if (cars[i].equals(car)){
                cars[i]=cars[size-1];
                size--;
                System.out.println("You have know " + size + " cars in your fleet");
                return true;
            }
        }
        return false;
    }

    public void display() {
        int index = 0;
        for (int i = 0; i < size; i++) {
            index++;
            if (index==6){
                System.out.println();
                index = 1;
            }
            if (i < size-1){
                System.out.print(cars[i] + "; ");
            } else {
                System.out.println(cars[i]);
            }
        }
    }

    public void displayCarByColor(Color color) {
        System.out.println("Cars in color " + color + ":");
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor().equals(color)){
                System.out.println(cars[i].toString());
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("No founds");
        }
    }

    public int getNewestCar() {
        int year = cars[0].getProductionYear();
        for (int i = 0; i < size; i++) {
            if (year < cars[i].getProductionYear()){
                year = cars[i].getProductionYear();
            }
        }
        return year;
    }

    public int getBrandCount(String brand) {
        System.out.print("You have ");
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)){
                count++;
            }
        }
        System.out.println(count + " cars from the brand " + brand);
        return count;
    }

}
