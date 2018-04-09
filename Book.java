package com.company;

public class Book extends Literature{
    String author;

    public Book(String name, int year, String author) {
        super(name, year);
        this.author = author;
    }
    
    public void print() {
        super.print();
        System.out.println("Автор книги :" + author);
    }
}
