package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartBiggerThenFinish() {
        int start = 13;
        int finish = 11;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void positiveScript() {
        int start = 0;
        int finish = 15;
        int result = Counter.sum(start, finish);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartBiggerThenFinishForEven() {
        int start = 9;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartLessThanFinish() {
        int start = 4;
        int finish = 14;
        int result = Counter.sumByEven(start,finish);
        int expected = 54;
        assertThat(result).isEqualTo(expected);
    }

}