package ru.job4j.calculate;

public class Calculator4 {
    public static void plus(int first, int second){
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator4.plus(500, 100);
        Calculator4.plus(4, 2);
        Calculator4.plus(3, 5);

    }
}
