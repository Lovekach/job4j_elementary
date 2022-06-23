package ru.job4j.condition;

public class Film1 {
    public static String permission(int age) {
        String label = age >= 18 ? "Please, enjoy it." : "You can watch it.";
        return label;

    }

    public static void main(String[] args) {
        String msg = Film1.permission(33);
        System.out.println(msg);
    }
}
