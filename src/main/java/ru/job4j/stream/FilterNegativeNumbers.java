package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 7, -11, -8, -6);
        List<Integer> positive = numbers.stream().filter(n -> n > 0).toList();
        positive.forEach(System.out::println);
    }
}
