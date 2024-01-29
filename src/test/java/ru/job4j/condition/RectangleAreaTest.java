package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {

    @Test
    public void ifP4K1S1() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double result = RectangleArea.square(p, k);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenP28K4Result31Dot35() {
        double p = 28;
        double k = 4;
        double expected = 31.35;
        double result = RectangleArea.square(p, k);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}
