package ru.job4j.condition.SqArea;

public class SqArea2 {
    public static double square(double p, double k, double s) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result1 = SqArea2.square(4, 1,1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea2.square(6, 2,2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
    }
}
