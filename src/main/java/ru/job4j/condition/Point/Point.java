package ru.job4j.condition.Point;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
        double x = x2 - x1;
        double first = Math.pow(x, 2);
        double y = y2 - y1;
        double second = Math.pow(y, 2);
        double tree = first + second;
        double result =  Math.sqrt(tree);
        return result;


    }


    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);


    }
}
