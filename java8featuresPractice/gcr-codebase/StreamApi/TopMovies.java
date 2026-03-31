import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = year;
    }

    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }

    public String toString() {
        return name + " - " + rating + " - " + releaseYear;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("A", 4.5, 2023),
            new Movie("B", 4.8, 2024),
            new Movie("C", 3.9, 2022),
            new Movie("D", 4.7, 2021),
            new Movie("E", 4.9, 2023),
            new Movie("F", 4.6, 2020)
        );

        List<Movie> top5 = movies.stream()

            .filter(m -> m.getRating() >= 4)

            .sorted((m1, m2) -> {
                if (m2.getRating() == m1.getRating())
                    return m2.getReleaseYear() - m1.getReleaseYear();

                return Double.compare(m2.getRating(), m1.getRating());
            })

            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(m -> System.out.println(m));
    }
}
