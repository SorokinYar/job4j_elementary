package ru.job4j.homework;

public class FindByIndex {

    public static int findElementByIndex(int[] data, int index) {
        int result = -1;
        for (int i =0; i < data.length; i++) {
            if (index == i) {
                result = data[i];
                break;
            }
        }
      return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {3, 7, 4, 9, 11};
        System.out.println(findElementByIndex(array,3));
    }
}
