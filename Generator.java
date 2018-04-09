package com.company;


public class Generator {
    public static Literature[][] generateData() {
        String[][] names = {
                {"Война и мир", "1984", "Улисс", "Лолита", "Великий Гетсби"},
                {"Пролетарий", "Мурзилка", "Автомир", "Слово Пастыря", "Солянка"},
                {"Наука и техника", "Мир Животных", "IT просвещение", "Физика и быт"}
        };
        String[] authors = {"Лев Толстой", "Джордж Оруэлл", "Джеймс Джойс", "Владимир Набоков", "Френсис Скотт"};
        int[][] years = {
                {1867, 1949, 1922, 1955, 1925},
                {1918, 1935, 1960, 1900, 1980},
                {1960, 1954, 1999, 1984},
        };
        int[] monthes = {1, 3, 8, 11, 4};
        String[][] topics = {
                {"Социализм", "Развлечение и обучение", "Машиностроение", "Оккультизм", "Кулинария"},
                {"Наука", "Природа", "Программирование", "Элементарная физика"},
        };
        String[] publishings = {"Ранок", "Жизнь", "Source IT", "Галлилео"};
        Literature books[] = new Book[authors.length];
        Literature magazines[] = new Magazine[monthes.length];
        Literature yearbooks[] = new Yearbook[publishings.length];

        for (int i = 0; i < 3; i++) {
            if(i == 0) {
                for (int j = 0; j < authors.length; j++) {
                    books[j] =  new Book(names[i][j], years[i][j], authors[j]);
                }
            } else if (i == 1) {
                for (int j = 0; j < monthes.length; j++) {
                    magazines[j] = new Magazine(names[i][j], years[i][j], topics[0][j], monthes[j]);
                }
            } else if (i == 2){
                for (int j = 0; j < publishings.length; j++) {
                    yearbooks[j] = new Yearbook(names[i][j], topics[1][j], publishings[j], years[i][j]);
                }
            }

        }
        Literature literatures[][] =  {books, magazines, magazines};
        return literatures;
    }
}
