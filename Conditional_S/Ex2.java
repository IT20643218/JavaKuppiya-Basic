/*using for loop*/
import java.util.*;

class Ex2{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	 calculateTotal();
	
	}
	
	public static void calculateTotal(){//method declaration
	Scanner input = new Scanner (System.in);
	
		int total = 0;
		
		for (int i =0 ;i <2;i++){
			System.out.print("Enter Number" + (i+1) +": ");
			int numbers = input.nextInt();
			
			total = total+ numbers;
			
		}			
		
		System.out.println("Total is :" + total);
	}

}