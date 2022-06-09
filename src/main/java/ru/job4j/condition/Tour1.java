package ru.job4j.condition;

public class Tour1 {
    public static void offer(boolean passport) {
        System.out.println("A clietn has foreign passport : " + passport);
        if(passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");

        }
    }

    public static void main(String[] args) {
        Tour1.offer(true);
        Tour1.offer(false);
    }
}
