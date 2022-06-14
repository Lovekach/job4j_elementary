package ru.job4j.condition;

public class IfElseReturnEasy {
    public static boolean greatThen(int first, int second) {
        return first > second;
    }

    public static void main(String[] args) {
        boolean result = greatThen(2, 3);
        System.out.println(result);
    }
}
