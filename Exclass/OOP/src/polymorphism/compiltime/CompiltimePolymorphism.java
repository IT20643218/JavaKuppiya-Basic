package polymorphism.compiltime;

//Method Over lording
public class CompiltimePolymorphism {
    public void myMethod(){
        System.out.println("My Method");
    }
    public void myMethod(int x){
        System.out.println("My Method(int)");
    }
    public void myMethod(int x,int y){
        System.out.println("My Method(int,int)");
    }
    public void myMethod(String x,int y){
        System.out.println("My Method(String,int)");
    }
}
