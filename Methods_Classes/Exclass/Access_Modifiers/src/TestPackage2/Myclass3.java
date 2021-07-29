package TestPackage2;

import TestPackage.Myclass;

//sub class
public class Myclass3 extends Myclass{
    public void myMethod(){
        Myclass object  = new Myclass();

        System.out.println(object.publicVariable);
        System.out.println(object.protectedVariable);

    }
}
