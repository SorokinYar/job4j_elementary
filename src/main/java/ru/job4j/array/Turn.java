package ru.job4j.array;

import java.util.Arrays;

public class Turn {
        public static int[] back(int[] array) {
            for (int index = 0;  index < array.length / 2; index++) {
                int temp = array[array.length - 1 - index];
                array[array.length - 1 - index] = array[index];
                array[index] = temp;
            }
            return array;
        }

    public static void main(String[] args) {
        int[] number = new int[] {1, 2, 3, 4, 5};
        int[] result = back(number);
        System.out.println(Arrays.toString(result));
    }
}
