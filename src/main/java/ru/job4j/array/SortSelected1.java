package ru.job4j.array;

public class SortSelected1 {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = MinDiapason1.findMin(array, i, array.length - 1);
            int index = FindLoop1.indexInRange(array, min, i, array.length);
            SwitchArray.swap(array, i, index);
        }
        return array;
    }
}
