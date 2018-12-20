package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Power4Test {
    private Power4 power = new Power4();
    @Test
    public void power4Integer() {
        String expected = "Number is power of 4";
        String actual = power.check(64);
        assertEquals(expected, actual);
    }
    @Test
    public void power4Decimal() {
        String expected = "Number is power of 4";
        String actual = power.check(0.0625);
        assertEquals(expected, actual);
    }
    @Test
    public void notPower4() {
        String expected = "Number is not the power of 4";
        String actual = power.check(8);
        assertEquals(expected, actual);
    }
}