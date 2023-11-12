package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book gameofthrones = new Book();
        gameofthrones.setName("Игра престолов");
        gameofthrones.setNumberofpages(1500);
        Book metro = new Book();
        metro.setName("Метро");
        metro.setNumberofpages(1000);
        Book cleancode = new Book();
        cleancode.setName("Clean Code");
        cleancode.setNumberofpages(500);
        Book blackman = new Book();
        blackman.setName("Черный человек");
        blackman.setNumberofpages(800);
        Book[] biblio = new Book[4];
        biblio[0] = gameofthrones;
        biblio[1] = metro;
        biblio[2] = cleancode;
        biblio[3] = blackman;
        for (int index = 0; index < biblio.length; index++) {
            Book shelf = biblio[index];
            System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
        }
        System.out.println("После перестановки [0] и [3]");
        Book[] zero = new Book[1];
        zero[0] = biblio[3];
        biblio[3] = biblio[0];
        biblio[0] = zero[0];
        for (int index = 0; index < biblio.length; index++) {
            Book shelf = biblio[index];
            System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
        }
        System.out.println("После условия: вывод на экран только книг с именем Clean Code");
        for (int index = 0; index < biblio.length; index++) {
            Book shelf = biblio[index];
            if (shelf.getName().equals(cleancode.getName())) {
                System.out.println(shelf.getName() + " - " + shelf.getNumberofpages());
            }
        }

    }
}
