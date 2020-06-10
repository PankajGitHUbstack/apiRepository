package com.api.abstraction;

abstract class FirstAbsn {


    abstract void m1();

    abstract void m2();

    abstract void m3();

    public static void m4(){
        System.out.println("=====Concreate method=====");

    }


    public static void main(String[] args) {
        FirstAbsn.m4();
    }
}
