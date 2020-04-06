package telran.controller;

import telran.dao.Schedule;
import telran.data.Address;
import telran.data.Cinema;
import telran.data.Genre;
import telran.data.Movie;

import static telran.data.Cinema.isCinemaInArray;

public class CinemaApp {

    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Thalia");
        Cinema cinema2 = new Cinema("Star", new Address("Hauptstraße", 1 ));
        Address address = new Address("Berlinerstraße", 16);
        Cinema cinema3 = new Cinema("Astra", address);
        Cinema cinema4 = new Cinema("Space");

        cinema1.setAddress(new Address("Hohenzollerdamm", 56));
        cinema4.setAddress(new Address("Wasserstraße", 34));

        Cinema[] cinemas1 = {cinema1, cinema2, cinema3, cinema4};
        Cinema[] cinemas2 = {cinema1, cinema2};

        Movie movie1 = new Movie("Harry Potter", "25.03", Genre.ADVENTURE, cinemas1);
        Movie movie2 = new Movie("Hail Ceaser", "26.03", Genre.COMEDY, cinemas2);
        Movie movie3 = new Movie("Titanic", "27.03", Genre.DRAMA, cinemas1);
        Movie movie4 = new Movie("Figaro", "27.03", Genre.DRAMA, cinemas2);

        Schedule schedule = new Schedule(20);
        schedule.addMovie(movie1);
        schedule.addMovie(movie2);
        schedule.addMovie(movie3);
        schedule.addMovie(movie4);

        schedule.displayMovies();
        System.out.println();
        System.out.println(isCinemaInArray(cinemas1, "Astra"));
        System.out.println();
        schedule.displayMoviesByDate("27.03");
        System.out.println();
        schedule.displayMovieByCinema("Astra");
        System.out.println();
        schedule.displayCinemaByTitle("Hail Ceaser");

        System.out.println();
        schedule.displayCinemaByTitle2("Titanic");
        schedule.displayCinemaByTitle2("Tenet");
        System.out.println();
        schedule.displayMovieByGenre(Genre.ADVENTURE);
        schedule.displayMovieByGenre(Genre.LOVE_STORY);

    }

}
