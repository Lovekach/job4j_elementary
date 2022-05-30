package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Point1Test {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when13to41then4() {
        double expected = 3.6;
        int x1 = 1;
        int y1 = 4;
        int x2 = 3;
        int y2 = 1;
        double out = Point1.distance(x1, y1,x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when89to67then2() {
        double expected = 1.41;
        int x1 = 8;
        int y1 = 6;
        int x2 = 9;
        int y2 = 7;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}