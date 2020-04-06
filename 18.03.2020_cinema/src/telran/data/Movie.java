package telran.data;

import java.util.Arrays;
import java.util.Objects;

public class Movie {

    private String title;
    private String date;
    private Genre genre;
    private Cinema[] cinemas;

    public Movie(String title, String date, Genre genre, Cinema[] cinemas) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.cinemas = cinemas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(date, movie.date) &&
                genre == movie.genre &&
                Arrays.equals(cinemas, movie.cinemas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, date, genre);
        result = 31 * result + Arrays.hashCode(cinemas);
        return result;
    }

    @Override
    public String toString() {
        return "Movie: " + title +
                ", date: " + date +
                ", genre: " + genre +
                ", cinema: " + Arrays.toString(cinemas);
    }

    public void displayCinema() {
        for (int i = 0; i < cinemas.length; i++) {
            System.out.println(cinemas[i]);
        }
    }

}
