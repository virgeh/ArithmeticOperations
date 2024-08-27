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

        // Task 1: Arithmetic operations
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
    // Task 2: Print numbers from 1 to 10 using a for Loop
    printNumbers();

    // Task 3: Sum of First 100 Natural Numbers using a while Loop
    sumOfFirst100NaturalNumbers();

    // Task 4: Print Multiplication Table of a number using a while Loop
    printMultiplicationTable();

    // Task 5: Reverse a number using a while Loop
    reverseNumber();

    // Task 6: Create Pyramid and Reverse Pyramid of 5 lines using a for Loop
    printPyramid();
    printReversePyramid();

    // Task 7: Print array using foreach Loop
    printArray();

    // Task 8: Prompt for positive number using do-while Loop
    promptForPositiveNumber();
}

    // 1. Print numbers from 1 to 10 using a for Loop.
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2. Sum of First 100 Natural Numbers using a while Loop.
    public static void sumOfFirst100NaturalNumbers() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }

    // 3. Print Multiplication Table of a number using a while Loop.
    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }

    // 4. Reverse a number using a while Loop.
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }

    // 5. Create Pyramid of 5 lines using a for Loop.
    public static void printPyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Create Reverse Pyramid of 5 lines using a for Loop.
    public static void printReversePyramid() {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6. Print array using foreach Loop.
    public static void printArray() {
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 7. Prompt the user to enter a positive number using do-while Loop.
    public static void promptForPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You entered: " + number);
    }
}