package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int average) {
        return max(left, max(right, average));
    }

    public static int max(int left, int right, int average, int further) {
        int tmp = max(average, further);
        return max(left, right, tmp);
    }

    public static void main(String[] args) {
        int result = Max.max(2, 2);
        System.out.println(result);
    }
}
