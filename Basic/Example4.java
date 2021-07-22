import java.util.*;

class Example4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your First Name :");
		String firstname =input.next();
		
		System.out.print("Enter Your Second Name :");
		String secondname =input.next();

		System.out.print("Enter Your Last Name :");
		String lastname =input.next();
		
		System.out.print("Full Name is : "+firstname+" "+secondname+" "+lastname);
		
	}

}