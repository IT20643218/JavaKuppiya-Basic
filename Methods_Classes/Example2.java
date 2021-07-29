/*Variable Scope and lifetime*/
import java.util.*;

class Example2{
	public static void main(String args[]){
		
		{
			int x = 10;//declare variable
			System.out.println(x);//print variable
		}
		int x = 50;
		System.out.println(x);//print variable
	}		


}