package ru.job4j.array;

public class FindLoop1 {
    public static int indexOf(int[] data, int element) {
        int result = - 1;
        for(int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 7};
        int result =  indexOf(array, 5);
        System.out.println(result);
    }
}
