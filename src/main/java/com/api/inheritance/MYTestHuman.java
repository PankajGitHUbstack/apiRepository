package com.api.inheritance;

import com.api.inheritance.HeirachiLevelInheritance.ChildC;
import com.api.inheritance.multiLevelInheritance.ChildB;
import com.api.inheritance.singleLevelInheritance.ChildA;
import com.api.inheritance.singleLevelInheritance.Human;

public class MYTestHuman {

    public static void main(String[] args){
        //single level inheritance
        System.out.println("======single level inheritance==========");

        ChildA.listen();
        ChildA.speak();

        System.out.println("======muliti level inheritance==========");
        ChildB.see();
        ChildB.write();
        ChildB.listen();
        //Heirachi level inheritance
        System.out.println("======Heirachi level inheritance==========");
        ChildC.eat();
        ChildC.run();
        Human.stop();
    }
}
