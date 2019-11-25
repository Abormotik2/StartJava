package com.startJava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;
        do {
            System.out.print("Input the num1/operation/num2 into array by space: ");
            String expression = scan.nextLine();
            String[] symbols = expression.split(" ");
            calc.setNum1(Integer.parseInt(symbols[0]));
            calc.setMove(symbols[1].charAt(0));
            calc.setNum2(Integer.parseInt(symbols[2]));
            System.out.println("Result: " + calc.calculate());
            while (true) {
                System.out.print("Do u want to continue? Say yes or no...");
                answer = scan.nextLine();
                if (answer.equals("no")) {
                    System.out.println("Bye");
                    break;
                } else if (answer.equals("yes")) {
                    break;
                }
            }
        }
        while (answer.equals("yes"));
    }
}
