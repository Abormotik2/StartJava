package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    public void startGame() {
        int pcNum = (int) (Math.random() * 101);
        System.out.println("You have 10 attempts! " + p1 + " and " + p2);
        Player currentPlayer = p1;
        p1.setAttempts(initArray());
        p2.setAttempts(initArray());
        do {
            System.out.println(currentPlayer.getName() + " play game ");
            int index = findIndex(currentPlayer.getAttempts());
            int[] nums1 = Arrays.copyOf(p1.getAttempts(), index);
            int[] nums2 = Arrays.copyOf(p2.getAttempts(), index);
            if (index == -1) {
                System.out.println("Players, you have run out of attempts ");
                System.out.println(Arrays.toString(nums1));
                break;
            }

            int number = (currentPlayer.getAttempts()[index] = scanner.nextInt());
            if (number == pcNum) {
                System.out.println("Great, " + currentPlayer.getName() + " guessNumber = " + pcNum + " with " + (index + 1) + " attempts");
                System.out.println(p1.getName() + "s numbers is " + Arrays.toString(nums1));
                System.out.println(p2.getName() + "s numbers is " + Arrays.toString(nums2));
                break;
            } else if (number > pcNum) {
                System.out.println(currentPlayer.getName() + "'s" + " num is bigger then mine");
            } else {
                System.out.println(currentPlayer.getName() + "'s" + " num is smaller then mine");
            }
            currentPlayer = currentPlayer == p1 ? p2 : p1;

        } while (true);
    }

    public int[] initArray() {
        int[] array = new int[10];
        Arrays.fill(array, Integer.MIN_VALUE);
        return array;
    }

    public int findIndex(int[] array) {
        int lastIndex = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Integer.MIN_VALUE) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
}