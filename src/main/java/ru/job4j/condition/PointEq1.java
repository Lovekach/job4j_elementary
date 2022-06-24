package ru.job4j.condition;

public class PointEq1 {
    public static boolean eq(int x1, int y1, int x2, int y2, int z1, int z2) {
        return x1 == x2 && y1 == y2 && z1 == z2;
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2, 3, 3));
        System.out.println(eq(10, 10, 10, 10, 10, 10));
    }
}
