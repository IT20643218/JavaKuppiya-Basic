//Get five keyboard input and find maximum value

import java.util.*;

class Example3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		
		for(int i=1; i<= 5; i++)
		{
			System.out.print("Enter Number " + i +" :");	
			int number = input.nextInt();
			
			if (max < number){
				max = number;
			}
		}
		System.out.println("Maximum Number is " + max);

}
}