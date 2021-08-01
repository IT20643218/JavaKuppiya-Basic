package polymorphism.runtime;

public class Dog extends Animal{

    public void move(){//Override
        System.out.println("Run");
    }

    public void talk(){//override
        System.out.println("Buh...Buh...");
    }
}
