package ru.job4j.condition;

public class SqArea11 {
    public static double square(int p, double k, double s) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result1 = l * h;
        return result1;


    }

    public static void main(String[] args) {
        double result1 = SqArea11.square(4, 1, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea11.square(6,2, 2);
        System.out.println("p = 6, k = 1, s = 2, real = " + result2);
        double result3 = SqArea11.square(13, 5, 84);
        System.out.println("p = 13, k = 5, s = 84, real = " + result3);

    }
}
