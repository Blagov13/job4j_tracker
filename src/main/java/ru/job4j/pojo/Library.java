package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book gameofthrones = new Book("Game of Thrones", 1500);
        Book metro = new Book("Metro", 1000);
        Book cleancode = new Book("Clean Code", 500);
        Book blackman = new Book("Black Man", 800);
        Book[] list = new Book[4];
        list[0] = gameofthrones;
        list[1] = metro;
        list[2] = cleancode;
        list[3] = blackman;
        for (int index = 0; index < list.length; index++) {
            Book shelf = list[index];
            System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
        }
        System.out.println("После перестановки [0] и [3]");
        Book[] zero = new Book[1];
        zero[0] = list[3];
        list[3] = list[0];
        list[0] = zero[0];
        for (int index = 0; index < list.length; index++) {
            Book shelf = list[index];
            System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
        }
        System.out.println("После условия: вывод на экран только книг с именем Clean Code");
        for (int index = 0; index < list.length; index++) {
            Book shelf = list[index];
            if ("Clean Code".equals(shelf.getName())) {
                System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
            }
        }

    }
}
