package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class PointTest {
    @Test
    void when13to24then1dot41() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        double dist = a.distance(b);
        double expected = 1.41;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to23then1dot41() {
        Point a = new Point(0, 2);
        Point b = new Point(1, 3);
        double dist = a.distance(b);
        double expected = 1.41;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40to12then4dot12() {
        Point a = new Point(4, 1);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 4.12;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}
