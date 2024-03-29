package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas8In0() {
        int element = 8;
        int[] array = new int[] {8, 4, 6,5};
        int result = FindLoop.indexOf(array, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas3AndMinusOne() {
        int element = 3;
        int[] array = new int[] {4, 0, 8, 9};
        int result = FindLoop.indexOf(array, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapason2Of5Element5z() {
        int element = 5;
        int[] array = {1, 3, 6, 8, 4, 5, 9, 11};
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(array,element,start,finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
     }

}