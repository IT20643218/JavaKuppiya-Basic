/*class is blueprint of object */

public class Myclass {
    public static void main(String[] args) {
        testmethod();
    }
    public static void testmethod(){
        Myclass2 object = new Myclass2();

        object.myMethod();
        object.myMethod2();
        System.out.println(object.word);
        System.out.println(object.x);


    }
}


