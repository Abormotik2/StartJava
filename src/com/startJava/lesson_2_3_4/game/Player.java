package com.startJava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return attempts;
    }

    public void setAttempts(int[] arrayNum) {
        this.attempts = arrayNum;
    }
    @Override
    public String toString() {
        return name;
    }
}