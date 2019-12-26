package com.startJava.lesson_2_3_4.calculator;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Calculator {

    private BigDecimal num1 = new BigDecimal(0);
    private BigDecimal num2 = new BigDecimal(0);
    private char sign = '\0';
    private String[] symbols;

    public Calculator(String[] symbols) {
        this.symbols = symbols;
    }

    public void operation() {
        try {
            num1 = BigDecimal.valueOf(Double.parseDouble(symbols[0]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("");
        }
        sign = symbols[1].charAt(0);
        switch (sign) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                //  case '%':
                break;
            default:
                throw new IllegalArgumentException("");
        }
        try {
            num2 = BigDecimal.valueOf(Double.parseDouble(symbols[2]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("");
        }
    }

    public BigDecimal calculate() {
        switch (sign) {
            case '+':
                return num1.add(num2);
            case '-':
                return num1.subtract(num2);
            case '*':
                return num1.multiply(num2);
            case '/':
                return num1.divide(num2, 10, ROUND_HALF_UP);
            case '^':
                return num1.pow(num2.intValue());
            //  case '%':
            //      return num1 % num2;
            default:
                throw new IllegalArgumentException("");
        }
    }
}