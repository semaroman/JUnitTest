package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void arithmeticExceptionTest() {
        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException("Деление на ноль невозможно");
        });
    }
}