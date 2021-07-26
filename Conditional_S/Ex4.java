/*perameterized method*/

import java.util.*;

class Ex4{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter Number 1 :");
	int number1 = input.nextInt();
			
	System.out.print("Enter Number 2 :");
	int number2 = input.nextInt();
	
	
	System.out.println("");
	
	System.out.println("A. Addition");
	System.out.println("B. Subtraction");
	System.out.println("C. Multiplication");
	System.out.println("D. Division");
	
	System.out.println("");
	System.out.println("-->");
	String letter = input.next();
	
	switch(letter){
		case "A":
				add(number1,number2);//arguments
		break;
		case "B":
				sub(number1,number2);
		break;
		case "C":
				multi(number1,number2);
		break;
		case "D":
				Div(number1,number2);
		break;
		
		default:
			System.out.println("Invalid Letter");
	}
	
	}//end main method
	
	
	//Addition			
	public static void add(int number1,int number2){//perameterized method
	Scanner input = new Scanner (System.in);
				
		System.out.println("Addition is :" + (number1 + number2));
	}
	
	//Subtraction
	public static void sub(int number1,int number2){//perameterized method
	Scanner input = new Scanner (System.in);
		if (number1>number2){
				System.out.println("Subtraction is :" + (number1 - number2));
		}else{
				System.out.println("Subtraction is :" + (number2 - number1));
		}			
		
	}
	
	//Multiplication
	public static void multi(int number1,int number2){//perameterized method
	Scanner input = new Scanner (System.in);
				
		System.out.println("Multiplication is :" + (number1 * number2));
	}
	
	//Division
	public static void Div(double number1,double number2){//perameterized method
	Scanner input = new Scanner (System.in);
		if (number1>number2){
				System.out.println("Division is :" + (number1 / number2));
		}else{
				System.out.println("Division is :" + (number2 / number1));
		}		
		
	}

}//end class