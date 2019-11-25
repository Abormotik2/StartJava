package com.startJava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");
        int maxLength = scanner.nextInt();
        int[] number = new int[maxLength];
        System.out.print("Input the numbers into array by space: ");
        for (int i = 0; i < maxLength; i++) {
            number[i] = scanner.nextInt();
        }
        int max = number[0];
        for (int i = 0; i < maxLength - 1; i++) {
            if (max < number[i + 1]) {
                max = number[i + 1];
            }
        }
        System.out.println("Max number of array = " + max);
    }

}
