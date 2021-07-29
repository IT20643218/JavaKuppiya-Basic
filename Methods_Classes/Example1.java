/*Variable Scope and lifetime*/
import java.util.*;

class Example1{
	public static void main(String args[]){
		int x = 10;//declare variable
		
		{
			x = x + 5;//update variable
			System.out.println(x);//print variable
		}
		System.out.println(x);//print variable
	}		


}