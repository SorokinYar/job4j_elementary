package ru.job4j.loop;

public class Factorial {

    public static int factorial( int num) {
       int factorial = 1;
       for (int i = 1 ;  i <= Math.abs(num); i++) {
           factorial *= i;
       }
       return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
