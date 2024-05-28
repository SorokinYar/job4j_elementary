package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class Check1Test {

    @Test
    void whenAllTrueThenTrue () {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check1.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotAllTrueThenFalse() {
        boolean[] data = new boolean[] {false, true, true, false};
        boolean result = Check1.mono(data);
        assertThat(result).isFalse();
    }
}