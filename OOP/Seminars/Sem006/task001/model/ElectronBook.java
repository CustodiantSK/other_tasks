package Seminars.Sem006.task001.model;

import Seminars.Sem006.task001.service.BookGenre;

/**
 * Создали клас электронной книги, с возможностью уточнения формата и размера
 */
public class ElectronBook extends Book {
    String format;
    int size;

    public ElectronBook(String name, String autor, int age, String format, int size, BookGenre genre) {
        super(name, autor, age, genre);
        this.format = format;
        this.size = size;
    }

    public ElectronBook(String format, int size) {
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ElectronBook [format = " + format + ", size = " + size + "]";
    }

}
