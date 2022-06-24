package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Triangle1Test {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle1.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExist1() {
        double ab = 3;
        double ac = 5;
        double bc = 1;
        boolean result1 = Triangle1.exist(ab, ac, bc);
        Assert.assertTrue(result1);
    }

    @Test
    public void whenNotExist() {
        double ab = 5;
        double ac = 4;
        double bc = 3;
        boolean result2 = Triangle1.exist(ab, ac, bc);
        Assert.assertFalse(result2);
    }
}