package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int i = 0;  i < data.length; i++) {
            if(element == data[i]) {
               result = i;
               break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = - 1;
        for (int index = start; index < finish; index++) {
            if (element == data[index]) {
            result = index;
            break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] mas = new int[] {1, 3, 7};
        System.out.println(indexOf(mas, 7));
    }
}
