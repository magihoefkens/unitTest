package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void return30_whenAis10AndBis20(){
        //GIVEN
        int a=10;
        int b=20;
        int expected=30;
        //WHEN
        int actual=Main.sum(a,b);
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void returnTrue_whenNumberIsEven(){
        // GIVEN
        int n = 10;
        // WHEN
        boolean actual = Main.isEven(n);
        // THEN
        assertTrue(actual);
    }

    @Test
    void return75_whenDis5AndEis15(){
        //GIVEN
        int d = 5;
        int e = 15;
        int expected = 75;
        //WHEN
        int actual=Main.product(d,e);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void returnUpperCase_whenAchimIsLowerCase(){
        // GIVEN
        String achim = "Achim";
        String expected = "ACHIM";
        // WHEN
        String actual = Main.upperCase(achim);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void returnFalse_whenNumberIsPositive(){
        //GIVEN
        int zahl=-5;
        //WHEN
        boolean actual=Main.isPositive(zahl);
        //THEN
        assertFalse(actual);

    }
}