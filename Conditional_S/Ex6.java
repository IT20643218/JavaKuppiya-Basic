/*perameterized method*/

import java.util.*;

class Ex6{
	public static void main(String args[]){
	Scanner input = new Scanner (System.in);
	
	int result = claculateTotal(20,60);
	
	System.out.println("Total is :"+ result);
	
	}//end main method
				
	public static int claculateTotal(int numbers1,int numbers2){//return type int 
			int total = numbers1 + numbers2;
				
			return total;
		
	}


}//end class