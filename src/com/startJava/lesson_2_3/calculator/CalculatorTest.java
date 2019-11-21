package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc;
        String answer;
        do {
            calc = new Calculator();
            System.out.println("Edit first number : ");
            while (calc.setNum1(scan.nextInt()) < 0) ;
            System.out.println("Edit the operation: ");
            while (calc.setMove(scan.next().charAt(0)) == '\0') ;
            System.out.println("Edit second number : ");
            while (calc.setNum2(scan.nextInt()) < 0);
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
        } while (answer.equals("yes"));
    }
}