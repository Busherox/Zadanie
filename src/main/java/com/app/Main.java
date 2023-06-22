package com.app;

import com.calculator.Calculator;
import com.calculator.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (ADD, SUBTRACT, MULTIPLY, DIVIDE): ");
        String operationInput = scanner.next().toUpperCase();

        Operation operation;
        switch (operationInput) {
            case "ADD":
                operation = Operation.ADD;
                break;
            case "SUBTRACT":
                operation = Operation.SUBTRACT;
                break;
            case "MULTIPLY":
                operation = Operation.MULTIPLY;
                break;
            case "DIVIDE":
                operation = Operation.DIVIDE;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        Calculator calculator = new Calculator();
        double result = calculator.performOperation(operation, num1, num2);

        System.out.println("Result: " + result);
    }
}
