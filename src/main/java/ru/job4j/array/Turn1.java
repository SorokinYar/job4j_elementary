package ru.job4j.array;

public class Turn1 {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        int[] result = back(array);
        for (int element : result) {
            System.out.println(element);
        }
    }
}