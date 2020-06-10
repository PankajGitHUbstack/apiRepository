package com.api.polymorphism;


import com.api.polymorphism.overriden.ChildA;
import com.api.polymorphism.overloding.ChildB;

public class MYTestHuman {

    public static void main(String[] args){
        //single level inheritance
        System.out.println("======orerriding==========");

        ChildA.stop();

        ChildA.stop("pankaj");

        System.out.println("======orerloding==========");
        ChildB.stop();

        ChildB.stop("pankaj");

    }
}
