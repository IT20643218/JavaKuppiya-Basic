package abtraction;

public class Main {
    public static void  main(String[]args){
        Test test = new TestImpl();

        test.myMethod();
        int total = test.calculateTotal(10,50);
        System.out.println(total);

    }
}
