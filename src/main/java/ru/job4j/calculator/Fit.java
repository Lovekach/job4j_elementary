package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (180 - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(short height) {
        double rsl = (170 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        short heightn = 170;
        double woman = Fit.womanWeight(heightn);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
