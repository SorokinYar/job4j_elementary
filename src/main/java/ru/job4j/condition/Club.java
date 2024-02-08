package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
       if(hasMoney || beFriend) {
           System.out.println("Welcome!");
       } else {
           System.out.println("Chao persik!");
       }
    }

    public static void main(String[] args) {
        permission(true, false);
        permission(true, true);
        permission(false, false);
        permission(false,true);
    }
}
