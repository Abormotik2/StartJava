package com.startJava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1 = -1;
    private int num2 = -1;
    private char sign = '\0';
    private String[] symbols;

    public Calculator(String[] symbols) {
        this.symbols = symbols;
    }

    public void operation() {
        num1 = Integer.parseInt(symbols[0]);
        if (num1 < 0) {
            System.out.println("First number not positive, or not number yet!");
        }
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
        num2 = Integer.parseInt(symbols[2]);
        if (num2 < 0) {
            System.out.println("Second number not positive, or not number yet!");
        }
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return Math.floorDiv(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Calc Error!");
        }
        return sign;
    }
}