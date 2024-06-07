package ru.job4j.array;

import java.util.Arrays;

public class Matrix1 {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }


    public static void main(String[] args) {
        int[][] result = Matrix1.multiple(5);
        System.out.println(Arrays.deepToString(result));
    }
}
