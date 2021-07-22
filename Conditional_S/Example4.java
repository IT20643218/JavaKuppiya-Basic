/*Get five keyboard input and find
Maxmimum value
Total 
Avarage
Minimum Value*/

import java.util.*;

class Example4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		int total = 0;
		double avg = 0;
		
		for(int i=1; i<= 5; i++)
		{
			System.out.print("Enter Number " + i +" :");	
			int number = input.nextInt();
			
			if (max < number){
				max = number;
			}
			else if (min < number)
			{
				min = number;
			}
			
			total =total + number;
		}
		avg = total/5;
		System.out.println("============================");
		System.out.println("Maximum Number is :" + max);
		System.out.println("Minimum Number is :" + min);
		System.out.println("Total Value is :" + total);
		System.out.println("Avarage is :" + avg);
		
		
		
}
}