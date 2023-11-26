package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task f : list) {
            numbers.add(f.getNumber());
        }
        return numbers;
    }
}