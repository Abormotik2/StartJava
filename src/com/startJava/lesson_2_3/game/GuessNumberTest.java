package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Edit first name: ");
        Player p1 = new Player(scan.nextLine());
        System.out.println("Edit second name: ");
        Player p2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(p1, p2);
        String answer;
        do {
            game.startGame();
            while (true) {
                System.out.println("Do u want to continue? Say yes or no...");
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