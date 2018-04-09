package com.company;

public class Magazine extends Literature {
    String topic;
    int month;

    public Magazine(String name, int year, String topic, int month) {
        super(name, year);
        this.topic = topic;
        this.month = month;
    }
    public void print() {
        super.print();
        System.out.println( "Месяц:" + month);
        System.out.println("Тематика: " + topic);
    }
}
