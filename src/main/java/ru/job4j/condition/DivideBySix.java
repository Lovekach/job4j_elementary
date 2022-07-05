package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 3 != 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным,";
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = 24 % 6;
        System.out.println("Остаток от деления числе 24 и 6 равен: " + rsl);
        int rsl1 = 9 % 3;
        System.out.println("Остаток деления чисел 9 и 3 равен: " + rsl1);
        int rsl2 = 14 % 3;
        System.out.println("Остаток от деления числе 14 и 3 равен: " + rsl2);
        int rsl3 = 25 % 3;
        System.out.println("Остаток от деления числе 25 и 3 равен: " + rsl3);

    }
}

