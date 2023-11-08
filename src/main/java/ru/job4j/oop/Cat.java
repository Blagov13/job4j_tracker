package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void showName() {
        System.out.println(this.name);
    }

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("barsik");
        gav.showName();
        System.out.println(" ate ");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("barni");
        black.showName();
        System.out.println(" ate ");
        black.show();

    }
}
