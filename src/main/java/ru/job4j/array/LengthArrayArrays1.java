package ru.job4j.array;

public class LengthArrayArrays1 {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива: " + numbers[i].length);
        }
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива: " + number.length);
        }
    }
}
