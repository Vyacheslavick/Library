package com.company;

public class Yearbook {
    String name;
    String topic;
    String publishing;
    int year;

    public Yearbook(String name, String topic, String publishing, int year) {
        this.name = name;
        this.topic = topic;
        this.publishing = publishing;
        this.year = year;
    }
    public void printYear() {
        System.out.println("Название журнала: " + name);
        System.out.println("Тематика: " + topic);
        System.out.println("Год издания: " + year);
        System.out.println("Издательство: " + publishing);
        System.out.println("");
    }
    public boolean equalsYear(int year){
        return this.year == year;
    }
}
