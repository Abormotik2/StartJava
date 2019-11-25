package com.startJava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private int pcNum;
    private Player p1;
    private Player p2;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    public void startGame() {
        pcNum = (int) (Math.random() * 101);
        System.out.println("And now, lets start " + p1 + " and " + p2);
        Player currentPlayer = p1;
        do {
            System.out.println(currentPlayer.getName() + " play game ");
            currentPlayer.setNumber(scanner.nextInt());
            int number = currentPlayer.getNumber();
            if (number == pcNum) {
                System.out.println("Great, " + currentPlayer.getName() + " win!");
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