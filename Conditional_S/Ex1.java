import java.util.*;

class Ex1{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	 calculateTotal();
	
	}
	
	public static void calculateTotal(){//method declaration
	Scanner input = new Scanner (System.in);
	
		
			System.out.print("Enter Number 1 :");
			int number1 = input.nextInt();
			
			System.out.print("Enter Number 2 :");
			int number2 = input.nextInt();
		
			int total = number1 + number2 ;
		
		System.out.println("Total is :" + total);
	}

}