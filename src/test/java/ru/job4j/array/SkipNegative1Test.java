package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SkipNegative1Test {

    @Test
    void whenArray2By2() {
        int[][] array = {
                {1, -1},
                {-1, 1}
        };
        int[][] result = SkipNegative1.skip(array);
        int[][] expected = {
                {1, 0},
                {0, 1}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayNotSimmetric() {
        int[][] array = {
                {1},
                {-2, -3},
                {4, 5, -6},
                {7, 8, 9, -10}
        };
        int[][] result  = SkipNegative1.skip(array);
        int[][] expected = {
                {1},
                {0, 0},
                {4, 5, 0},
                {7, 8, 9, 0}
        };
        assertThat(result).isEqualTo(expected);
    }

}