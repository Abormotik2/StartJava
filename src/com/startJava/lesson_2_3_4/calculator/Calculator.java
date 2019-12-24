package com.startJava.lesson_2_3_4.calculator;

public class Calculator {

    private double num1;
    private double num2;
    private char sign = '\0';
    private String[] symbols;

    public Calculator(String[] symbols) {
        this.symbols = symbols;
    }

    public void operation() {
        try {
            num1 = Double.parseDouble(symbols[0]);
            sign = symbols[1].charAt(0);
            switch (sign) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                case '%':
                    break;
                default:
                    System.out.println("Don't support type!");
            }
            num2 = Double.parseDouble(symbols[2]);
        } catch (
                Exception e) {
            System.out.println("Error!!!" + " Input the num1/operation/num2 into array by space!");
        }

    }

    public double calculate() {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Calc Error!");
        }
        return sign;
    }
}