package ru.job4j.array;

import java.util.Arrays;

public class CompressPoint {

    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(compress2Point(new int[]{1, 0, 2, 0, 3, 0, 4})));
    }
}
