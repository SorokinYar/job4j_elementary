package ru.job4j.array;

public class SwithcArray1 {
    public static int[] swap(int[] array, int source, int destination){
        return  array;
    }

    public static int[] swapBorder(int[] array){
        int  temp = array[0];
        array[0] = array[array.length -1];
        array[array.length -1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
