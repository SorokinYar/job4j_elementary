package ru.job4j.condition;

import java.io.IOException;

public class GuessTheNumber {
    public static void guessTheNumber(int incoming) throws IOException {
        int myNumber = 2;
        if (incoming == myNumber) {
            System.out.println("Молодец,угадал!");
        } else if (incoming < myNumber) {
            System.out.println("Нет, моё чисо больше.Попробуй еще раз.");
        } else {
            System.out.println("Нет, моё число меньше. Попробуй еще раз.");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Давай поиграем.");
        System.out.print("Какую цифру я загадал от 1 до 4?");
        int incoming = System.in.read();
        guessTheNumber(incoming);
    }
}
