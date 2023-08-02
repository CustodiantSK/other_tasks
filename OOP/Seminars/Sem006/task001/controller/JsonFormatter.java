package Seminars.Sem006.task001.controller;

import java.util.List;

import Seminars.Sem006.task001.model.Book;
import Seminars.Sem006.task001.model.Format;

/**
 * форматирование в JSON
 */
public class JsonFormatter implements Formatter {

    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " был переведен в формат: " + Format.JSON);
        }

    }
}
