package ru.job4j.condition;

public class IfElseReturn {
    public static boolean greatThen(int first, int second) {
        boolean compare = first > second;
        if (compare) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = greatThen(10, 20);
        System.out.println(result);
    }
}
