package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixSum1Test {

    @Test
    void whenSinrle() {
        int[][] array = {
                {8}
        };
        int result = MatrixSum1.sum(array);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwo() {
    int[][] array = {
            {1, 2},
            {1, 2}
    };
    int result = MatrixSum1.sum(array);
    int expected = 6;
    assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int result = MatrixSum1.sum(array);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}



