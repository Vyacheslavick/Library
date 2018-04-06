package com.company;

public class Library {
    Book[] books;
    Magazine[] magazines;
    Yearbook[] yearbooks;

    public Library(Book[] books) {
        this.books = books;
    }

    public Library(Magazine[] magazines) {
        this.magazines = magazines;
    }

    public Library(Yearbook[] yearbooks) {
        this.yearbooks = yearbooks;
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printBook();
        }
    }

    public void printAllMag() {
        for (Magazine magazine : magazines) {
            magazine.printMag();
        }
    }

    public void printAllYear() {
        for (Yearbook yearbook : yearbooks) {
            yearbook.printYear();
        }
    }

    public void printEqualYearBook(int year) {
        for (Book book : books) {
            if (book.equalsYear(year)) {
                book.printBook();
            }
        }
    }

    public void printEqualYearMag(int year) {
        for (Magazine magazine : magazines) {
            if (magazine.equalsYear(year)) {
                magazine.printMag();
            }
        }
    }

    public void printEqualYearYB(int year) {
        for (Yearbook yearbook : yearbooks) {
            if (yearbook.equalsYear(year)) {
                yearbook.printYear();
            }
        }
    }
}



