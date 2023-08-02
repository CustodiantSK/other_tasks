package Seminars.Sem006.task001;

import java.util.Arrays;

import Seminars.Sem006.task001.controller.Formatter;
import Seminars.Sem006.task001.controller.JsonFormatter;
import Seminars.Sem006.task001.controller.Lib;
import Seminars.Sem006.task001.model.Book;
import Seminars.Sem006.task001.service.BookGenre;

public class Main {
    public static void main(String[] args) {
        BookGenre bookGenre = new BookGenre("Comedy");
        BookGenre bookGenre2 = new BookGenre("Tragedy");

        Lib libLib = new Lib(Arrays.asList(
                new Book("qwe", "Autor", 1865, bookGenre),
                new Book("qwe1", "Autor1", 1965, bookGenre),
                new Book("qwe2", "Autor", 1899, bookGenre2),
                new Book("qwe3", "Autor3", 2012, bookGenre2)));

        System.out.println("Поиск автора Autor = " + libLib.searchAutor("Autor"));
        System.out.println("Поиск автора Autor3 = " + libLib.searchAutor("Autor3"));

        System.out.println();
        Formatter formatter = new JsonFormatter();
        formatter.formatted(libLib.getBooks());

    }
}
