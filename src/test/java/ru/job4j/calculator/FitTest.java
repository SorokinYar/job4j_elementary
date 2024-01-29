package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    public void ifHight176() {
        short height = 176;
        double expected = 87.39;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void ifHightWoman160() {
        short height = 160;
        double expected = 57.49;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}