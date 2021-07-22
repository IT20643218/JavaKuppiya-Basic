import java.util.*;

class Example2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Numberer 1 :");
		int num1 =input.nextInt(); 
		
		System.out.print("Enter Numberer 2 :");
		int num2 =input.nextInt(); 
		
		System.out.print("Enter Numberer 3 :");
		int num3 =input.nextInt(); 
		
		System.out.print("Enter Numberer 4 :");
		int num4 =input.nextInt(); 
		
		System.out.print("Enter Numberer 5 :");
		int num5 =input.nextInt();
		
		int total = num1+num2+num3+num4+num5;
		double avarage=(double)total/5;//Casting
	
		System.out.println("Avarage is:"+avarage+"\n");
	}

}