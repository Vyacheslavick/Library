package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library librarybook = new Library(Generator.generateBook());
        Library libraryMag = new Library(Generator.generateMagazine());
        Library libraryYear = new Library(Generator.generateYearbook());
        librarybook.printAllBooks();
        libraryMag.printAllMag();
        libraryYear.printAllYear();
        System.out.println("Введите желаемый год:");
        int search = Integer.parseInt(scan.nextLine());
        librarybook.printEqualYearBook(search);
        libraryMag.printEqualYearMag(search);
        libraryYear.printEqualYearYB(search);
        

    }
}