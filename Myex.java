import java.util.*;

class Myex{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Product Name : ");
	String name = input.next();
	System.out.println();

	System.out.print("Enter product Selling Price :");
	float selling_p = input.nextFloat();
	
	System.out.print("Enter product Variable Cost :");
	float variable_c = input.nextFloat();
	
	System.out.print("Enter Fixed Cost :");
	float fixed_c = input.nextFloat();
	
	System.out.println();
	
	float contribution = selling_p - variable_c;
	System.out.println("Contribution per units :" + contribution );
	
	float BEP = fixed_c / contribution;
	System.out.println("Break Even Point in product " + name +" : "+  BEP );
	
	}
	
}