package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numerOfDay(String name) {
        return switch (name) {
            case "Monday.", "Понедельникю" -> 1;
            case "Thusday.", "Вторникю" -> 2;
            default -> -1;
        };
    }
}
