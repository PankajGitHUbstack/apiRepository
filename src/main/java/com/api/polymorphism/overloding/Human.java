package com.api.polymorphism.overloding;

public class Human {
    public static void speak() {
        System.out.println("i can speak");
    }

    public static void stop() {
        System.out.println("i can stop");

    }
    public static void stop(String s) {
        System.out.println("i can run in super class : "+s);
    }
}