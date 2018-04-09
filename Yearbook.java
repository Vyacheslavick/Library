package com.company;

public class Yearbook extends Literature{
    String topic;
    String publishing;

    public Yearbook(String name, String topic, String publishing, int year) {
        super(name, year);
        this.topic = topic;
        this.publishing = publishing;
    }
    public void print() {
        super.print();
        System.out.println("Тематика: " + topic);
        System.out.println("Издательство: " + publishing);
    }
}
