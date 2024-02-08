package ru.job4j.condition;

import java.io.IOException;
import java.util.Scanner;

public class WhatBigger {
    public static void equation(int x, int y) {
        if (x > y) {
            System.out.println(x + " больше, чем " + y);
        } else if (x < y) {
            System.out.println(y + " больше, чем " + x);
        } else {
            System.out.println(x + " равно " + y);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        equation(x, y);
    }
}
