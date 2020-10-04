package com.example.jackson;

import java.util.Arrays;

public class Book {
    private String title;
    private String isbn;
    private long year;
    private String[] authors;

    public Book() {

    }

    public Book(String title, String isbn, long year, String[] authors) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
