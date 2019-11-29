package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private Scanner scanner = new Scanner(System.in);
    private int pcNum;
    private int number;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
    }

    public void addNum() {
        number = scanner.nextInt();
    }

    public void startGame() {
        pcNum = (int) (Math.random() * 101);
        System.out.println("You have 10 attempts! " + p1 + " and " + p2);
        currentPlayer = p1;
        while (true){
            if (currentPlayer.lastNum() > 9) {
                System.out.println("Players, you have run out of attempts ");
                System.out.println(p1.getName() + "s numbers is " + Arrays.toString(p1.getAttempts()));
                System.out.println(p2.getName() + "s numbers is " + Arrays.toString(p2.getAttempts()));
                break;
            }
            System.out.println(currentPlayer.getName() + " play game ");
            addNum();
            currentPlayer.addAttempt(number);
            if(!checkNum(number)){
                break;
            }
            currentPlayer = currentPlayer == p1 ? p2 : p1;
        }
    }

    private boolean checkNum(int number) {
        if (number == pcNum) {
            System.out.println("Great, " + currentPlayer.getName() + " guessNumber = " + pcNum + " with " + currentPlayer.lastNum() + " attempts");
            System.out.println(p1.getName() + "s numbers is " + Arrays.toString(p1.getAttempts()));
            System.out.println(p2.getName() + "s numbers is " + Arrays.toString(p2.getAttempts()));
            return false;
        } else if (number > pcNum) {
            System.out.println(currentPlayer.getName() + "'s" + " num is bigger then mine");
            return true;
        } else {
            System.out.println(currentPlayer.getName() + "'s" + " num is smaller then mine");
            return true;
        }
    }
}



