package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Machine1Test {

    @Test

    void whenMoney38Prise20() {
        int money = 38;
        int prise = 20;
        int[] result = Machine1.change(money, prise);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine1.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine1.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

}