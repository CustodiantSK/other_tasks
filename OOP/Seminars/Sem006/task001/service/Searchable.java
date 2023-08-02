package Seminars.Sem006.task001.service;

import java.util.List;

import Seminars.Sem006.task001.model.Book;

/**
 * поиск по автору книги
 */
public interface Searchable {
    List<Book> searchAutor(String autorName);
}
