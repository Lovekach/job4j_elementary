package ru.job4j.condition;

public class Club1 {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club. ");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Club1.permission(true, true);
        Club1.permission(false, true);
        Club1.permission(true, false);
        Club1.permission(false, false);
    }
}
