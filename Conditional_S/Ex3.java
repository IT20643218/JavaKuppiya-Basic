/*perameterized method*/

import java.util.*;

class Ex3{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter Number 1 :");
	int number1 = input.nextInt();
			
	System.out.print("Enter Number 2 :");
	int number2 = input.nextInt();
	
	add(number1,number2);//arguments
	
	}
	
	public static void add(int number1,int number2){//perameterized method
	Scanner input = new Scanner (System.in);
		
	
		System.out.println("Addition is :" + (number1 + number2));
	}

}