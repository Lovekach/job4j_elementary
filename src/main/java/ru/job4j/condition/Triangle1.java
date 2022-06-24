package ru.job4j.condition;

public class Triangle1 {
    public static boolean exist(double ab, double ac, double bc) {
        boolean r = (ab + ac > bc && ac + bc > ab && ab + bc > ac);
        return r;
    }

    public static void main(String[] args) {
        boolean result = Triangle1.exist(2, 2, 2);
        System.out.println(result);
        boolean result1 = Triangle1.exist(3, 5, 1);
        System.out.println(result1);
        boolean result2 = Triangle1.exist(5, 4, 3);
        System.out.println(result2);
    }
}

