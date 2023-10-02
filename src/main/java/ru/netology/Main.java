package ru.netology;

import java.util.function.*;

class Main {
    public static void main(String[] args) {
        try {
            Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        }
    }
}

class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    static BinaryOperator<Integer> plus = (x, y) -> x + y;
    static BinaryOperator<Integer> minus = (x, y) -> x - y;
    static BinaryOperator<Integer> devide = (x, y) -> x / y;
    Consumer<Integer> println = System.out::println;
}