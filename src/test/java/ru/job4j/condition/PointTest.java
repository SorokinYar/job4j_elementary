package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void if0020() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void ifMinus10Minus23() {
        int x1 = -1;
        int y1 = 0;
        int x2 = -2;
        int y2 = 3;
        double expected = 3.162;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    public void someNumberWithDot() {
        int x1 = 21;
        int y1 = 10;
        int x2 = 9;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 14.4222;
        assertThat(result).isEqualTo(expected, withPrecision(0.0001));
    }
}