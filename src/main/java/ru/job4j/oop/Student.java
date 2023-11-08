package ru.job4j.oop;

public class Student {
    public void sing() {
        System.out.println("I believe I can fly");
    }

    public void accordion() {
        System.out.println("Play Play Play");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.sing();
        petya.sing();
        petya.sing();
        petya.accordion();
        petya.accordion();
        petya.accordion();
    }
}
