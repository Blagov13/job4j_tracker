package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едем на автобусе");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Число пассажиров: " + passenger);
    }

    @Override
    public int fillUp(int fuel) {
        return Transport.super.fillUp(fuel);
    }
}
