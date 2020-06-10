package com.api.abstraction;

interface ABSMethodWithInterface{

    public abstract int  sum(int a,int j);
    int mul(int a,int b,int c);
    public abstract int div(int a,int b);
    float sub(int a,int b);

}

public class ABSInterface implements ABSMethodWithInterface {


    public int sum(int a, int j) {
        return a + j;
    }
    public int mul(int a, int b, int c) {
        return a * b * c;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public float sub(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        ABSMethodWithInterface abcMethodWithInterface= new ABSInterface();
        System.out.println("Div :"+abcMethodWithInterface.div(10,2));
        System.out.println("Mul :"+abcMethodWithInterface.mul(2,3,4));
        System.out.println("Dub :"+abcMethodWithInterface.sub(4,2));
        System.out.println("Sum :"+abcMethodWithInterface.sum(2,2));
    }
}
