package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int cell = 0; cell < array[i].length; cell++) {
                result = result + array[i][cell];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int array[][] = {{1, 3, 7}, {3, 8}, {4, 7, 2}};
        System.out.println(sum(array));
    }
}
