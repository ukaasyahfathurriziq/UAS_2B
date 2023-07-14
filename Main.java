import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films = List.of(
                new Film("1", "Film A", 2019, 7.5),
                new Film("2", "Film B", 2020, 7.9),
                new Film("3", "Film C", 2021, 8.4),
                new Film("4", "Film D", 2022, 9.1)
        );

        System.out.println("Sebelum pengurutan:");
        printFilms(films);

        selectionSort(films);

        System.out.println("Setelah pengurutan:");
        printFilms(films);
    }

    private static void selectionSort(List<Film> films) {
        for (int i = 0; i < films.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < films.size(); j++) {
                if (films.get(j).getRating() < films.get(minIndex).getRating()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Film temp = films.get(i);
                films.set(i, films.get(minIndex));
                films.set(minIndex, temp);
            }
        }
    }

    private static void printFilms(List<Film> films) {
        for (Film film : films) {
            System.out.println(film.toString());
        }
        System.out.println();
    }
}
