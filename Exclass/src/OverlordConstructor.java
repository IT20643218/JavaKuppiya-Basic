//Constructor overlording
public class OverlordConstructor {
    public static void main(String[]args){
       Mytest();
    }

    public static void Mytest(){
        ConstructorOverlording object1 = new ConstructorOverlording();
        ConstructorOverlording object2 = new ConstructorOverlording(10);
        ConstructorOverlording object3 = new ConstructorOverlording(10,20);
        ConstructorOverlording object4 = new ConstructorOverlording("Java");

    }


}
