package com.startJava.lesson_2_3_4.array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {1.2f, 2.2f, .2f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
        for (float number : numbers1) {
            System.out.print(number + " ");
        }
        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println(" ");
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.print(numbers[i] + " ");
        String[] text = new String[3];

        for (String string : text) {
            System.out.println(string);
        }
    }
}
