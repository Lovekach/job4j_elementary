package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (181 - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(short height) {
        double rsl = (162 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 181;
        double man = Fit.manWeight(height);
        System.out.println("Man 181 is " + man);
        height = 162;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 162 is " + woman);
    }

}
