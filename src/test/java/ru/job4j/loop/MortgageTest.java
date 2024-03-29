package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        double amount = 1000;
        double salary = 1200;
        double percent = 0.01;
        int result = Mortgage.year(amount,salary,percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        double amount = 100;
        double salary = 120;
        double percent = 0.5;
        int result = Mortgage.year(amount,salary,percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
        }

        @Test
    void  whenAmount1000Salary1200Percent20ThenYear1() {
        double amount = 1000;
        double salary = 1200;
        double percent = 0.2;
        int result = Mortgage.year(amount, salary,percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}