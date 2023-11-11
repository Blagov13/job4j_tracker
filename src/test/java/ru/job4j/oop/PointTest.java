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

    @Test
    void when111to224then1dot41() {
        Point b = new Point(1, 1, 1);
        Point c = new Point(2, 2, 4);
        double dist3D = c.distance(b);
        double expected = 1.41;
        assertThat(c.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when001to123then2dot23() {
        Point a = new Point(0, 0, 1);
        Point c = new Point(1, 2, 3);
        double dist3D = c.distance(a);
        double expected = 2.23;
        assertThat(c.distance(a)).isEqualTo(expected, withPrecision(0.01));
    }
}
