package com.api.polymorphism.overriden;

public class ChildA extends Human {
    public static void eat(){

        System.out.println("i can eat");
    }
    public static void stop() {
        System.out.println("i can stop");

    }
    public static void stop(String s) {

        System.out.println("i can run in child :"+s);
    }

}
