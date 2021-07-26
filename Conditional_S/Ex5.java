/*perameterized method*/

import java.util.*;

class Ex5{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	int[] arr = {10,20,30,40,50,60};
	addFive(arr);
	
	for (int i =0;i< arr.length;i++){
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	
	}//end main method
				
	public static void addFive(int[] numbers){//perameterized method
	Scanner input = new Scanner (System.in);
		for (int i = 0;i<numbers.length;i++){
				numbers[i] = numbers[i] +5;
		}			
		
	}
	
	

}//end class