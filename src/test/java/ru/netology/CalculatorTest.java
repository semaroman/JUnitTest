package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    int x = 1;
    int y = 2;

    @Test
    void plusTest() {
        int expected = x + y;
        int actual = Calculator.plus.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        int expected = x - y;
        int actual = Calculator.minus.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void devideTest() {
        int expected = x / y;
        int actual = Calculator.devide.apply(x, y);
        Assertions.assertEquals(expected, actual);
    }
}