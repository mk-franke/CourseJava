package telran.dao;

import telran.data.Cinema;
import telran.data.Genre;
import telran.data.Movie;

public class Schedule {

    private Movie[] movies;
    private int size;

    public Schedule(int capacity) {
        movies = new Movie[capacity];
        size = 0;
    }

    public boolean addMovie(Movie movie){
        if(size < movies.length){
            movies[size] = movie;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteMovie(Movie movie){
        for (int i = 0; i < size; i++) {
            if(movies[i].equals(movie)){
                movies[i] = movies[size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayMovies(){
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    public void displayMoviesByDate(String date){
        System.out.println(date + " you can see following movies: ");
        for (int i = 0; i < size; i++) {
            if (movies[i].getDate().equalsIgnoreCase(date)){
                System.out.println(movies[i].getTitle() + " / " + movies[i].getGenre());
                movies[i].displayCinema();
                System.out.println("-------------------");
            }
        }
    }

    public void displayMovieByCinema(String name){
        System.out.println("In cinema " + name + " you can watch");
        for (int i = 0; i < size; i++) {
            if (Cinema.isCinemaInArray(movies[i].getCinemas(), name)){
                System.out.println(movies[i].getTitle() + " / " + movies[i].getGenre() + " / " + movies[i].getDate());
                System.out.println("-------------------");
            }
        }
    }

    public int getIndexOfMovie(String title){
        int indexOfMovie = -1;
        for (int i = 0; i < size; i++) {
            if (movies[i].getTitle().equalsIgnoreCase(title)){
                indexOfMovie = i;
            }
        }
        return indexOfMovie;
    }

    public void displayCinemaByTitle(String title){
        int index = getIndexOfMovie(title);
        if (index<0){
            System.out.println("The movie is not in the schedule");
        } else {
            System.out.println("You can watch " + title + " on " + movies[index].getDate() + " in following cinema ");
            movies[index].displayCinema();
        }
    }

    public void displayCinemaByTitle2(String title) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (movies[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("You can watch " + title + " on " + movies[i].getDate() + " in following cinema ");
                movies[i].displayCinema();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("The movie is not in the schedule");
        }
    }

    public void displayMovieByGenre(Genre genre){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (movies[i].getGenre().name().equalsIgnoreCase(String.valueOf(genre))){
                System.out.println("You can watch following movies with the genre - " + genre + ":");
                System.out.println(movies[i].getTitle() + " / " + movies[i].getDate());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No movie with such genre");
        }
    }

}
