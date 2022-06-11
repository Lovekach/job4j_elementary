package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        int result = left > right ? left : right;
        System.out.println(result);
        int result1 = left < right ? left : right;
        System.out.println(result1);
        int result2 = left == right ? left : right;
        System.out.println(result2);

        return result;
    }

    public static void main(String[] args) {
        int abs = Max.max(1,2);
        System.out.println(abs);
        int abs1 = Max.max(2,3);
        System.out.println(abs1);
        int abs2 = Max.max(5, 2);
        System.out.println(abs2);

    }
}
