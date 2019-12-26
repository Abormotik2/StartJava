package com.startJava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest extends RuntimeException {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc;
        String expression;
        String answer;
        System.out.println("Calculator start!");
        do {
            System.out.print("Input the num1/operation/num2 into array by space: ");
            expression = scan.nextLine();
            calc = new Calculator(expression.split(" "));
            try {
                calc.operation();
            } catch (Exception e) {
                System.out.println("Error!!!Not number or not add the operation!");
            }
            try {
                System.out.println("Result: " + calc.calculate());
            } catch (Exception e) {
                System.out.println("Don't support type!");
            }
            do {
                System.out.print("Do u want to continue? Say yes or no...");
                answer = scan.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        while (answer.equals("yes"));
    }
}