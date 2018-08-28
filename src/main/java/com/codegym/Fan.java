package com.codegym;

public class Fan {
    public static void main(String[] args) {
        CoursingFan fan1 = new CoursingFan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");
        System.out.println(fan1);
    }
}
