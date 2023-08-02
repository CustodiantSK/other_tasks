package Seminars.Sem006.task001.controller;

import java.util.List;

import Seminars.Sem006.task001.model.Book;

/**
 * выводит форматы книг
 */
public interface Formatter {
    void formatted(List<Book> books);

}
