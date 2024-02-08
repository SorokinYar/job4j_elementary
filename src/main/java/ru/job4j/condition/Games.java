package ru.job4j.condition;

public class Games {
    public static void permision(boolean allowByParents, boolean hasMoney) {
        if (allowByParents &&  hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permision(true,true);
        permision(true, false);
        permision(false, true);
        permision(false, false);
    }
}
