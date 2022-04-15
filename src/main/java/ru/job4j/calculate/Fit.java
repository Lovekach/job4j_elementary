package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double rs1 = (187 - 100) * 1.15;
        return  rs1;
    }
    public static double womanWeight(short height) {
        double rs1 = (187- 110) * 1.15;
        return  rs1;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
