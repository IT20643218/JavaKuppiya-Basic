package abtraction;

public  class TestImpl implements Test{

    @Override
    public void myMethod() {
        System.out.println("Hello Java");
    }

    @Override
    public int calculateTotal(int number1, int number2) {
        return number1 + number2;
    }
}
