package ru.job4j.condition;

public class Point11 {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double first = Math.pow(x, 2);
        double y = y2 - y1;
        double second = Math.pow(y, 2);
        double third = first + second;
        double d = Math.sqrt(third);
        return d;
    }

    public static void main(String[] args) {
        double result1 = Point11.distance(0, 0, 2, 0);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        double result2 = Point11.distance(1, 3, 4,1);
        System.out.println("result2 (1, 3) to (4, 1) " + result2);
        double result3 = Point11.distance(8, 9, 6, 7);
        System.out.println("result3 (8, 9) to (6, 7) " + result3);
    }
}
