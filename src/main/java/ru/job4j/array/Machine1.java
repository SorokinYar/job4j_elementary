package ru.job4j.array;

import java.util.Arrays;

public class Machine1 {

    public static int[] change(int prise, int money) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int value = prise - money;
        for (int i = 0; i < coins.length; i++) {
            while (value >= coins[i]) {
                result[size++] = coins[i];
                value -= coins[i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}
