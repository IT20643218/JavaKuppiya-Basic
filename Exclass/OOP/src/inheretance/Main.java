package inheretance;

public class Main {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.move();//method call

        Animal animal = new Dog();
        dog.eat();

        Puppy puppy = new Puppy();
        puppy.move();
    }
}
