package ru.job4j.array;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


class MinDiapason1Test {

    @Test

    void whenMin3() {
        int[] array = {1, 2, 3, 5, 7, 8};
        int start = 2;
        int finish = 5;
        int result = MinDiapason1.findMin(array, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void whenMinMinus1() {
        int[] array = {3, 5, 8, -1, 8};
        int start = 0;
        int finish = 3;
        int result = MinDiapason1.findMin(array, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void whenMin8() {
        int[] array = {3, 5, 6, 6, 1};
        int start = 1;
        int finish = 4;
        int result = MinDiapason1.findMin(array, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}