package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> diapason = new ArrayList<>();
        for (int i = start; i < end; i++) {
            diapason.add(func.apply((double) i));
        }
        return diapason;
    }
}
