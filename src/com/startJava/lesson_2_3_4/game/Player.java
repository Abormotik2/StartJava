package com.startJava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int iterator = 0;

    public Player(String name) {
        this.name = name;
    }

    public void addAttempt(int number) {
        attempts[iterator] = number;
        iterator++;
    }

    public int lastNum() {
        return iterator;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, iterator);
    }

    @Override
    public String toString() {
        return name;
    }
}