package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then() {
        int left = 1;
        int right =2;
        String result = Max.max(left, right);
        String expected = "Max = 2" ;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void whenMax4to2Then() {
        int left = 4;
        int right = 2;
        String result = Max.max(left, right);
        String expected = "Max = 4";
    }

}