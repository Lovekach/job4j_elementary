package ru.job4j.condition;

public class MathAbsUsage {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("Разность чисел равна: " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("Абсолютное значение разности чисел равно: " + abs);
        int m = 12;
        int e = 10;
        int result = e - m;
        System.out.println("Разность чисел равна: " + result);
        int fbi = Math.abs(result);
        System.out.println("Абсолютное значение разности чисел равно: " + fbi);
    }
}
