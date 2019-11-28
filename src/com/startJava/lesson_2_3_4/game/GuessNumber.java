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
        do {
            currentPlayer.ifLose();
            System.out.println(currentPlayer.getName() + " play game ");
            int number = scanner.nextInt();
            currentPlayer.addAttempts(number);
            if (number == pcNum) {
            System.out.println("Great, " + currentPlayer.getName() + " guessNumber = " + pcNum + " with " + currentPlayer.lastNum() + " attempts");
                System.out.println(p1.getName() + "s numbers is " + Arrays.toString(p1.getAttempts()));
                System.out.println(p2.getName() + "s numbers is " + Arrays.toString(p2.getAttempts()));
                break;
            } else if (number > pcNum) {
                System.out.println(currentPlayer.getName() + "'s" + " num is bigger then mine");
            } else {
                System.out.println(currentPlayer.getName() + "'s" + " num is smaller then mine");
            }
            currentPlayer = currentPlayer == p1 ? p2 : p1;

        } while (true);
    }
}