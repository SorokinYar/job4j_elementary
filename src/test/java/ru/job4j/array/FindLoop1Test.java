package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class FindLoop1Test {
    @Test
    void element3Index1() {
        int[] array = new int[] {1, 3, 5};
        int result  = FindLoop1.indexOf(array, 3);
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDiapasonHas2Then3() {
        int[] data = {0, 1, 2, 3};
        int element = 2;
        int start = 0;
        int finish = 3;
        int result  = FindLoop1.indexInRange(data, element, start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotFindElementResultMinus1() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        int element = 1;
        int start = 2;
        int finish = 6;
        int expected = -1;
        int result = FindLoop1.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}