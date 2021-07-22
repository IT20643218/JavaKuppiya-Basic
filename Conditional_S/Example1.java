import java.util.*;

class Example1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :");
		int num1 = input.nextInt();
		
		System.out.print("Enter Number 2 :");
		int num2 = input.nextInt();
		
		System.out.print("Enter Number 3 :");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3){
				System.out.println("Maximum Number is :Number 01");
		}
		else if (num2 > num1 && num2 > num3){
				System.out.println("Maximum Number is :Number 02");
		}
		else
		{
			System.out.println("Maximum Number is :Number 03");
		}
		
	}

}