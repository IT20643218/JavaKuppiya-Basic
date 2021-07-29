/* instance block or Nonstatic block*/
public class Block {

    {//instance block
        System.out.println("Block");
    }

    static {
        System.out.println("Static Block");
    }
    Block() {
        System.out.println("Constructor");
    }

}
