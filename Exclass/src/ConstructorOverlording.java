public class ConstructorOverlording {
    ConstructorOverlording(){
        System.out.println("Create Object");
    }

    //Constructor Over lording
    ConstructorOverlording(int i){
        System.out.println("Create Object(int)");
        System.out.println(i);
    }

    ConstructorOverlording(int i,int x){
        System.out.println("Create Objects(int,int)");
        System.out.println(i+" "+ x);

    }

    ConstructorOverlording(String a){
        System.out.println("Create Objects(String)");
        System.out.println(a);
    }
}
