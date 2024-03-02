package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void whenMinFirst() {
        int[] array = {1, 3, 1, 8, 6, 5, 10};
        int start = 2;
        int finish = 5;
        int expected = 1;
        int result = MinDiapason.findMin(array,start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinMiddle() {
        int[] array = {1, 3, 6, 0, 7, 4};
        int start = 0;
        int finish = 4;
        int expected = 0;
        int result = MinDiapason.findMin(array,start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinLast() {
        int[] array = {1, 2, 3, 4, 2};
        int start = 1;
        int finish = 4;
        int expected = 2;
        int result = MinDiapason.findMin(array,start,finish);
        assertThat(result).isEqualTo(expected);
    }

}