package com.api.abstraction;

abstract class FirstAbsn1 {


    abstract void m1();

    abstract void m2();

    abstract void m3();

    public static void m4() {
        System.out.println("=====Concreate method=====");

    }
}
class TestDemo extends FirstAbsn1{

     void m1(){
         System.out.println("First asb m1");
    }

    void m2() {

        System.out.println("First asb m2");


    }

    void m3() {
        System.out.println("First asb m3");


    }


    public static void main(String[] args) {
        FirstAbsn1.m4();
        FirstAbsn1 firstAbsn1=new TestDemo();
        firstAbsn1.m1();
        firstAbsn1.m2();
        firstAbsn1.m3();
    }

}