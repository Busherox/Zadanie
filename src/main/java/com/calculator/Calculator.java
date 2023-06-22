package com.calculator;

public class Calculator {

    public double performOperation(Operation operation, double num1, double num2) {
        switch (operation) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
