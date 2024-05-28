package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberofpages;

    public Book(String name, int age) {
        this.name = getName();
        this.numberofpages = getNumberofpages();
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
