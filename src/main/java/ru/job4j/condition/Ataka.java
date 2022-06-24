package ru.job4j.condition;

public class Ataka {
    public static void MoreArmy(boolean strong, boolean gold, boolean alive) {
        if (strong || gold && alive) {
            System.out.println("I can have more army milord. ");
        } else {
            System.out.println("I'am very tired milord. ");

        }
    }

    public static void main(String[] args) {
        Ataka.MoreArmy(true, true, true);
        Ataka.MoreArmy(true, false, true);
        Ataka.MoreArmy(true, true, false);
        Ataka.MoreArmy(false, false, false);
    }
}
