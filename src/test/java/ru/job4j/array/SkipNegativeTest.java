package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SkipNegativeTest {

    @Test
    void whenArrayHasNegative() {
        int[][] array = {
                {2, 3},
                {5, -1}
        };
        int[][] expected = {
                {2, 3},
                {5, 0}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayNitHasNegative() {
        int[][] array = {
                {1, 2, 4},
                {3, 4},
                {5, 0, 7, 9}
        };
        int[][] expected  = {
                {1, 2, 4},
                {3, 4},
                {5, 0, 7, 9}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isEqualTo(expected);
    }

}