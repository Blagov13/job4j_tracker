package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passenger) {

    }

    @Override
    public void fillUp(int fuel) {

    }

    public static void main(String[] args) {
        Transport bus = new Transport() {
            @Override
            public void drive() {
                System.out.println("Едем на автобусе");
            }

            @Override
            public void passengers(int passenger) {
                System.out.println("Число пассажиров: " + passenger);
            }

            @Override
            public void fillUp(int fuel) {
                int price = fuel * 60;
                System.out.println("Заправили " + fuel + " литров на " + price + " рублей");
            }
        };
        bus.drive();
        bus.passengers(10);
        bus.fillUp(60);

    }
}
