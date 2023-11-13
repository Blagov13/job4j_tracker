package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberofpages;

    public Book(String name, int numberofpages) {
        this.name = name;
        this.numberofpages = numberofpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }
}
