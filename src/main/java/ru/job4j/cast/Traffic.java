package ru.job4j.cast;

public class Traffic {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] traffic = new Vehicle[]{bus, train, airplane};
        for (Vehicle a : traffic) {
            a.move();
        }
    }
}
