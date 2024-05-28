package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLoop1Test {
    @Test
    void element3Index1() {
        int[] array = new int[] {1, 3, 5};
        int result  = FindLoop1.indexOf(array, 3);
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

}