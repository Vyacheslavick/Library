package com.company;


public class Generator {
    public static Book[] generateBook() {
        String[] names = {"Война и мир", "1984", "Улисс", "Лолита", "Великий Гетсби"};
        String[] authors = {"Лев Толстой", "Джордж Оруэлл", "Джеймс Джойс", "Владимир Набоков", "Френсис Скотт"};
        int[] years = {1867, 1949, 1922, 1955, 1925};
        Book books[] = new Book[names.length];
        for (int i = 0; i < names.length; i++) {
            books[i] = new Book(names[i], authors[i], years[i]);
        }
        return books;
    }

    public static Magazine[] generateMagazine() {
        String[] names = {"Пролетарий", "Мурзилка", "Автомир", "Слово Пастыря", "Солянка"};
        String[] topics = {"Социализм", "Развлечение и обучение", "Машиностроение", "Оккультизм", "Кулинария"};
        int[] years = {1918, 1935, 1960, 1900, 1980};
        int[] monthes = {1, 3, 8, 11, 4};
        Magazine magazines[] = new Magazine[names.length];
        for (int i = 0; i < names.length; i++) {
            magazines[i] = new Magazine(names[i], topics[i], years[i], monthes[i]);
        }
        return magazines;
    }

    public static Yearbook[] generateYearbook() {
        String[] names = {"Наука и техника", "Мир Животных", "IT просвещение", "Физика и быт"};
        String[] topics = {"Наука", "Природа", "Программирование", "Элементарная физика"};
        String[] publishingHouses = {"Ранок", "Аскания-Нова", "Source IT", "Галилео"};
        int[] years = {1960, 1954, 1999, 1984};
        Yearbook yearbooks[] = new Yearbook[names.length];
        for (int i = 0; i < names.length; i++) {
            yearbooks[i] = new Yearbook(names[i], topics[i], publishingHouses[i], years[i]);
        }
        return yearbooks;
    }

}
