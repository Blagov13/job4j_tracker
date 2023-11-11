package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int w) {
        return w / x;
    }

    public int sumAllOperation(int e) {

       return sum(e) + minus(e) + multiply(e) + divide(e);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl1 = calculator.divide(20);
        int rsl = calculator.multiply(5);
        int rsl2 = sum(5);
        int rsl3 = minus(10);
        int rsl4 = calculator.sumAllOperation(20);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}
