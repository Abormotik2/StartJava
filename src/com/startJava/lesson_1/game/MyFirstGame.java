package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int numComp = 52;
        int numUser = 10;
        System.out.println("Edit number from " + 0 + " to " + 100);
        while (numComp != numUser) {
            if (numUser > numComp) {
                System.out.println("U,r number is bigger then mine");
                numUser--;
            } else if (numUser < 0 && numUser > 100) {
                System.out.println("U,r number is not at game");
                numUser = 0;
            } else if (numUser < numComp) {
                System.out.println("U,r number is smaller then mine");
                numUser++;
            }
        }
        System.out.println("Great ur number like mine = " + numComp);
    }
}

