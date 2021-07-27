import java.util.*;

class Methods{
	//main Method
	public static void main (String []args){
		//Call All methods
		myMethod();
		myMethod(10);
		myMethod(10,20);
		myMethod("Java Method");
		myMethod("Java Method",50);
		myMethod(50,"Java Method");
	}
	//my method 01
	public static void myMethod(){
		System.out.println("MyMethod");
	}
	//my method 02
	public static void myMethod(int x){
		System.out.println("My Method(int)");
	}
	//my method 03
	public static void myMethod(int x,int y){
		System.out.println("My Method(int,int)");
	}
	//my method 04
	public static void myMethod(String s){
		System.out.println("My Method(String)");
	}
	//my method 05
	public static void myMethod(String s,int x){
		System.out.println("My Method(String,int)");
	}
	//my method 06
	public static void myMethod(int x,String s){
		System.out.println("My Method(String)");
	}
}



