package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        if (left > right) {
            return " Max = " + left;
        } else if (left < right) {
            return "Max = " + right;
        } else {
            return "Left = Right";
        }
    }

    public static void min(int left, int right) {
        if (left > right) {
            System.out.println("Left bigger.");
        } else if (left < right) {
            System.out.println("Right bigger.");
        } else {
            System.out.println("Left = Right");
        }
    }
        public static void main (String[]args){
            String result = max(3, 3);
            System.out.println(result);

            min(3, 3);

            String result1 =max(9, 9);
            System.out.println(result1);
        }
    }
