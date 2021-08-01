package TestPackage;
//java have 04 acces modifire

//Super class
public class Myclass {
    public int publicVariable =100;//public -->>Everywhere in project we can access
    private int PrivateVariable=200;//private -->> only own class
    protected int protectedVariable =300;//protected --> same package & Sub class
    int defaultVariable = 500;//default --> same package
}

public void myMethod(){
    System.out.println(publicVariable);
    System.out.println(PrivateVariable);
    System.out.println(protectedVariable);
    System.out.println(defaultVariable);
}
