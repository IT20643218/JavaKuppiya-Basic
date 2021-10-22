package Question02;

import java.util.ArrayList;

public class GenericPerson<T extends IPerson> {
	
	 void displaElements(ArrayList<T> arrlist) {
		 
		 for(T t:arrlist) {
			 System.out.println(t.displayDetails());
		 }
	 }
}
