package com.startJava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1 = -1;
    private int num2 = -1;
    private char sign = '\0';

    public int setNum1(int num1) {
        if (num1 >= 0) {
            this.num1 = num1;
        } else {
            System.out.println("First number not positive, or not number yet!");
        }
        return num1;
    }

    public char setMove(char sign) {
        switch (sign) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                this.sign = sign;
                break;
            default:
                System.out.println("Don't support type!");
        }
        return sign;
    }

    public int setNum2(int num2) {
        if (num2 >= 0) {
            this.num2 = num2;
        } else {
            System.out.println("Second number not positive, or not number yet!");
        }
        return num2;
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
        }
        throw new IllegalArgumentException("Calc Error!");
    }
}