package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int passenger);

    default int fillUp(int fuel) {
        int price;
        price = fuel * 60;
        return price;
    }

}
