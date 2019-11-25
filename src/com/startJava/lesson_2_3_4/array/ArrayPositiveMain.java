/*Сумма четных положительных элементов массива
В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.*/
package com.startJava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayPositiveMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number length of array: ");
        int maxLen = scanner.nextInt();
        int[] nums = new int[maxLen];
        System.out.print("Input the number into array by space: ");
        for (int i = 0; i < maxLen; i++) {
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < maxLen; i++) {
            if (nums[i] > 0 && nums[i] % 2 == 0)
                sum += nums[i];
        }
        System.out.println("sum even number = " + sum);
    }
}


