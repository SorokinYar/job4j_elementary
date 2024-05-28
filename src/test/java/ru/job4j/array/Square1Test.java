package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class Square1Test {

    @Test
    void whenBound5Number16() {
        int bound = 5;
        int[] result = Square1.calculate(bound);
        int[] expected = new int[] {0, 1, 4 , 9, 16};
        assertThat(expected).containsExactly(result);
    }

    @Test
    void whenBound0Result0() {
        int bound = 0;
        int[] result = Square1.calculate(bound);
        int[] expected = new int[] {};
        assertThat(expected).containsExactly(result);
     }

   }