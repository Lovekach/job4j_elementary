package ru.job4j.condition.Point;

public class Point2 {
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
        double result = Point2.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point2.distance(3,4, 5, 6);
        System.out.println("result2 (3,4) to (5, 6) " + result2);
    }
}
