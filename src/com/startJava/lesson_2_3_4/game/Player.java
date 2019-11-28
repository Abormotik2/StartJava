package com.startJava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] arrayNum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrayNum() {
        return arrayNum;
    }

    public void setArrayNum(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }
    @Override
    public String toString() {
        return name;
    }
}