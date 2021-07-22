import java.util.*;

class If1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Age :");
		int age = input.nextInt();
		
		if (age >= 18){
			System.out.println("Elder");
		}
		else
		{
			System.out.println("Age Not Valiad");
		}		
		
	}

}