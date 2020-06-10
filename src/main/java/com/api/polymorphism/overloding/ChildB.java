package com.api.polymorphism.overloding;

public class ChildB extends Human{
    public static void stop() {
        System.out.println("i can stop");

    }
    public static void stop(String s) {

        System.out.println("i can run in child : "+s);
    }
}
