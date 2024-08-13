package com.example.arithmetic;

import java.util.Scanner;

public class Main {

    // Method using if-else for arithmetic operations
    public static double performArithmeticIfElse(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Error: Division by zero.");
                return Double.NaN;
            }
        } else {
            System.out.println("Invalid operator.");
            return Double.NaN;
        }
    }

    // Method using switch-case for arithmetic operations
    public static double performArithmeticSwitch(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Asking for the arithmetic operation
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        // Asking the user to choose method
        System.out.print("Choose method (1 for if-else, 2 for switch-case): ");
        int choice = scanner.nextInt();

        double result = 0;

        // Perform operation based on user choice
        if (choice == 1) {
            result = performArithmeticIfElse(num1, num2, operator);
        } else if (choice == 2) {
            result = performArithmeticSwitch(num1, num2, operator);
        } else {
            System.out.println("Invalid choice.");
        }

        // Display the result
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}