package com.startJava.lesson_2_3_4.calculator;

public class Calculator {
    private int[] num1 = new int[1];
    private int[] num2 = new int[1];
    private char[] sign = new char[1];

    public int setNum1(int num1) {
        if (num1 >= 0) {
            this.num1[0] = num1;
        } else {
            System.out.println("It's not positive number, or not number yet!");
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
                this.sign[0] = sign;
                break;
            default:
                System.out.println("Don't support type!");
        }
        return sign;
    }

    public int setNum2(int num2) {
        if (num2 >= 0) {
            this.num2[0] = num2;
        } else {
            System.out.println("It's not positive number, or not number yet!");
        }
        return num2;
    }

    public int calculate() {
        switch (sign[0]) {
            case '+':
                return num1[0] + num2[0];
            case '-':
                return num1[0] - num2[0];
            case '*':
                return num1[0] * num2[0];
            case '/':
                return Math.floorDiv(num1[0], num2[0]);
            case '^':
                return (int) Math.pow(num1[0], num2[0]);
            case '%':
                return num1[0] % num2[0];
        }
        throw new IllegalArgumentException("Calc Error!");
    }
}