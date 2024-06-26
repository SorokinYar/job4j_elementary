package ru.job4j.array;

public class TwoNumberSum1 {

    public static int[] getIndex(int[] array, int target) {
        int[] result = new int[0];
        for (int left = 0; left < array.length; left++) {
            for (int right = 0; right < array.length; right++) {
                if (array[left] + array[right] == target && array[left] != array[right]) {
                    result = new int[]{left, right};
                }
            }
        }
        return result;
    }

}