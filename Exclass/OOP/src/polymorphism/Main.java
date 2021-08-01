package polymorphism;

import polymorphism.compiltime.CompiltimePolymorphism;
import polymorphism.runtime.Animal;
import polymorphism.runtime.Dog;

public class Main {
    public static void main(String[]args){
        //complile time polymorphism
        CompiltimePolymorphism object = new CompiltimePolymorphism();
        object.myMethod(50,30);

        System.out.println("======================");
        //Run time polymorphism
        Animal dog = new Dog();
        dog.move();
        dog.talk();

    }
}
