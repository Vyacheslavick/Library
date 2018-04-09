package com.company;

public class Library {
    Literature[][] literatures;

    public Library(Literature[][] literature) {
        this.literatures = literature;
    }

    public void printAll() {
        for (Literature literature[] : literatures) {
            for (int i = 0; i < 3; i++) {
                literature[i].print();
            }
        }
    }
    
    public void printEqualYear(int year) {
        search:
        for (Literature literature[] : literatures) {
            for (int i = 0; i < 3; i++) {
                if (literature[i].equalsYear(year)) {
                    literature[i].print();
                    break search;
                }
            }
        }
    }
}
