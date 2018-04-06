package com.company;

public class Book {
    String name;
    String author;
    int yearWereWritten;

    public Book(String name, String author, int yearWereWritten) {
        this.name = name;
        this.author = author;
        this.yearWereWritten = yearWereWritten;
    }

    public void printBook() {
        System.out.println("Название книги: " + name);
        System.out.println("Автор книги :" + author);
        System.out.println("Год издания :" + yearWereWritten);
        System.out.println("");
    }
    public boolean equalsYear(int yearWereWritten){
        return this.yearWereWritten == yearWereWritten;
    }
}


