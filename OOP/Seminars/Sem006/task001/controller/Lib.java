package Seminars.Sem006.task001.controller;

import java.util.ArrayList;
import java.util.List;

import Seminars.Sem006.task001.model.Book;
import Seminars.Sem006.task001.service.Searchable;

/**
 * создание и заполнение листа книг
 */
public class Lib implements Searchable {
    List<Book> books;

    public Lib(List<Book> books) {
        this.books = books;
    }

    public Lib() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> searchAutor(String autorName) {
        List<Book> resBook = new ArrayList<>();
        for (Book book : books) {
            if (book.getAutor().equals(autorName)) {
                resBook.add(book);
            }
        }
        return resBook;
    }
}
