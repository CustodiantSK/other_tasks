package Seminars.Sem006.task001.service;

/**
 * сортировка жанра книги по жанрам
 */
public class BookGenre implements Genre {
    String genre;

    public BookGenre() {
    }

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenreName() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }

}
