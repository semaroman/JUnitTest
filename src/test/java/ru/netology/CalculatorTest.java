package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    int x = 6;
    int y = 3;

    @Test
    void plusTest() {
        int expected = 9;
        int actual = Calculator.plus.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        int expected = 3;
        int actual = Calculator.minus.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void devideTest() {
        int expected = 2;
        int actual = Calculator.devide.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }
}