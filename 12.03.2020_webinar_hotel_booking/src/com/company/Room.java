package com.company;

public class Room {

    String number;
    int capacity;

    public Room(String number) {
        this.number = number;
        this.capacity = 1;
    }

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "number = " + number +
                ", capacity = " + capacity;
    }

}
