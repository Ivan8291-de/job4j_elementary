package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when37to914thenDot9() {
        double expected = 9.22;
        int x1 = 3;
        int y1 = 7;
        int x2 = 9;
        int y2 = 14;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1115to83thenDot12() {
        double expected = 12.37;
        int x1 = 11;
        int y1 = 15;
        int x2 = 8;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus45to98thenDot5() {
        double expected = 5.83;
        int x1 = -4;
        int y1 = -5;
        int x2 = -9;
        int y2 = -8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}