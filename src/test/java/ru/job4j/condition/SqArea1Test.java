package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqArea1Test {

    @Test
    public void whenP6K2Square() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea11.square(p, k, expected);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP4K1Square() {
        int expected = 1;
        int p = 4;
        int s = 1;
        double k = 1;
        double out = SqArea11.square(p, k, s);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP13K5Square() {
        double expected = 6.76;
        int p = 13;
        int s = 84;
        double k = 4;
        double out = SqArea11.square(p, k, s);
        Assert.assertEquals(expected, out, 0.01);

    }
}