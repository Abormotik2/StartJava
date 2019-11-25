package com.startJava.lesson_2_3_4.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMan(true);
        System.out.println(wolf.isMan());
        wolf.setName("Scar");
        System.out.println(wolf.getName());
        wolf.setWeight(30.5f);
        System.out.println(wolf.getWeight());
        wolf.setAge(10);
        wolf.setColor('W');
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}