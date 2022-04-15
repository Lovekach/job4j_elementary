package ru.job4j.calculate;

public class MathFunc {
    public static int funch1(int x){
        int y = x * x + 1;
        return y;
    }
    public static int funch2(int x){
        int y = 1 / x;
        return y;
    }
    public static void main(String[] args) {
       int result1 = MathFunc.funch1(3);
       result1 = MathFunc.funch1(100);
       int result2 = MathFunc.funch2(5);
       int result3 = result1 + result2;
        System.out.println(result3);
    }
}
