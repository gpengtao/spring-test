package com.gpengtao.model;

import java.util.List;

/**
 * Created by gpengtao on 16/1/22.
 */
public class User {

    private String name;

    private int age;

    private Book book;

    private List<Book> books;

    public User() {
        System.out.println("============ User ==============");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
