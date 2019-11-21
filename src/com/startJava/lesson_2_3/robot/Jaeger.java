package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName = "";
    private String mark = "";
    private String origin = "";
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public Jaeger(String modelName, String mark, String origin, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("Ur using drift!");
        return true;
    }

    public void move() {
        System.out.println("U has walked five steps!");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
    }

    @Override
    public String toString() {
        return String.format("ModelName = %s\n mark = %s\n origin = %s\n weight = %f\n height = %f\n speed = %d\n strength = %d\n armor = %d\n", modelName, mark, origin, weight, height,speed,strength,armor);
    }
}