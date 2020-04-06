package telran.controller;

import telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {

        Book book1 = new Book("The little prince", "Saint-Exupery");
        Printable book = new Book("War and Peace", "Tolstoy");
        Printable journal = new Journal("World");
        Printable newspaper = new Newspaper();
        WaterPipe pipe = new WaterPipe();

        Printable.print1();
        
        Printable[] objects = {book, book1, journal, newspaper, pipe};
        for (Printable o:objects) {
            o.print();
        }

        pipe.printState(1);
        read(pipe);

        Printable book2 = createPrintable("Ulysses", true);
        book2.print();
        ((Book)book2).setAuthor("Joyce");
        book2.print();
        Printable journal2 = createPrintable("National Geography", false);
        journal2.print2();
        System.out.println(journal2.getClass());

    }

    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "Undefined");
        } else {
            return new Journal(name);
        }
    }

}
