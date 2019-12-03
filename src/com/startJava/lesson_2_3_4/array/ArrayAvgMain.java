package com.startJava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayAvgMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number .... of array: ");
        int maxl = scanner.nextInt();
        int[] numbers = new int[maxl];
        System.out.print("Input the number into array: ");
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < maxl; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            avg = sum / maxl;
        }
        for (int i = 0; i < maxl; i++) {
            if (numbers[i] < avg) {
                System.out.println("The low compare(avg) number is: " + numbers[i]);
            }
        }
    }
}