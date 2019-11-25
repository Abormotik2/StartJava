/*Максимальный из элементов массива с четными индексами
В массиве найти максимальный элемент с четным индексом.*/
package com.startJava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayEvenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number length of array: ");
        int maxL = scanner.nextInt();
        int[] num = new int[maxL];
        System.out.print("Input the num into array by space: ");
        for (int i = 0; i < maxL; i++) {
            num[i] = scanner.nextInt();
        }
        int max = num[0];
        for (int i = 0; i < maxL - 1; i+=2) {
            if (max < num[i + 2]) {
                max = num[i + 2];
            }

        }
        System.out.println("Max even number = " + max);
    }
}
