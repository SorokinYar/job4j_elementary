package ru.job4j.array;

public class Square1 {
    public static int[] calculate(int bound){
        int[] result = new int[bound];
        for (int i = 0;i < bound;i++) {
            result[i] = (int) Math.pow(i, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(0);
        for (int number : array) {
            System.out.println(number);
        }
    }
}
