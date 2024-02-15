package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int num) {
        if (num == 1) {
            return  false;
        }
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime ;
    }

    public static void main(String[] args) {
        System.out.println(check(1));
    }
}
