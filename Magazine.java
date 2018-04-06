package com.company;

public class Magazine {
    String name;
    String topic;
    int year;
    int month;
    public Magazine(String name, String topic, int year, int month){
        this.name = name;
        this.topic = topic;
        this.year = year;
        this.month = month;

    }
    public void printMag() {
        System.out.println("Название журнала: " + name);
        System.out.println("Тематика: " + topic);
        System.out.println("Год: " + year + " Месяц:" + month);
        System.out.println("");
    }
    public boolean equalsYear(int year){
        return this.year == year;
    }

}

