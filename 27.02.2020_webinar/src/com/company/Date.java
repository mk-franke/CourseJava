package com.company;

import java.util.Random;

public class Date {

    private int day;
    private int month;
    private int year;
    private Random rnd = new Random(System.currentTimeMillis());

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
//        if(day>=1 && day<=31) {
            this.day = day;
//        } else {
//            System.out.println("Wrong day!");
//        }
    }

    public String toString() {
        String s = "Date: " + day + ".";
        s += month + ".";
        s += year;
        return s;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public boolean isCorrect() {
        return isCorrectYear() && isCorrectMonth() && isCorrectDay();
    }

    private boolean isCorrectYear() {
        return (year>0);
    }

    private boolean isCorrectMonth() {
        return (month>0) && (month<=12);
    }

    public boolean isCorrectDay() {
        if((day>0) && (day<=getDayPerMonth())){
            return true;
        } else {
            return false;
        }
    }

    public int getDayPerMonth() {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeapYear() && month==2) {
            return 29;
        } else {
            return days[month-1];
        }
    }

    public boolean isLeapYear() {
        return year%4==0;
    }

    public Date getRandomDate(){
        Date date;
        do {
            int year = getRandomInt(1900, 2020);
            int month = getRandomInt(1, 12);
            int day = getRandomInt(1, 31);
            date = new Date(day, month, year);
        } while(!date.isCorrect());
        return date;
    }

    private int getRandomInt(int min, int max){
        return min+rnd.nextInt(max-min+1);
    }

}
