package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library libraryAll = new Library(Generator.generateData());
        libraryAll.printAll();
        System.out.println("");
        System.out.println("Введите желаемый год:");
        int search = Integer.parseInt(scan.nextLine());
        libraryAll.printEqualYear(search);
    }
}
