package Seminars.Sem006.task001.model;

import Seminars.Sem006.task001.service.BookGenre;

/**
 * Создали класс книга, для возможности заполнения по шаблону
 */
public class Book {
    private String name;
    private String autor;
    private int age;
    private BookGenre genre;

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Book(String name, String autor, int age, BookGenre genre) {
        this.name = name;
        this.autor = autor;
        this.age = age;
        this.genre = genre;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book [name = " + name + ", autor = " + autor + ", age = " + age + ", genre = " + genre + "]";
    }

}
