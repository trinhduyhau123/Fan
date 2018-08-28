package com.codegym;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFan {
    @Test
    public void TesF() {
        CoursingFan fan2= new CoursingFan();
        fan2.setSpeed(fan2.FAST);
        fan2.setRadius(10);
        fan2.setOn(true);
        fan2.setColor("yellow");

        int speed = 3;
        assertEquals(speed, fan2.FAST);
        double radius = 10;
        assertEquals(radius, fan2.getRadius());
    }
}
