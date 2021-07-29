package statickeyword;

import statickeyword.TestStatic;

public class TestStaticMain {
    public static void main(String[]args){
        testMethod();
    }
    public static void testMethod(){
           TestStatic object = new TestStatic();
           TestStatic object1 = new TestStatic();

           object.myMethod();
           object1.myMethod();

           object.x=1000;

           System.out.println(object.x);
           System.out.println(object1.x);

           object1.x=2000;

            System.out.println(object.x);
            System.out.println(object1.x);

            object.myMethod();
            object1.myMethod2();

    }
}
