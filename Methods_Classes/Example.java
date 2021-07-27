import java.util.*;

class Example{
	public static void main (String []args){
		myMethod("sumedhe");
	}
	
	public static void myMethod(){
		System.out.println("MyMethod");
	}
	
	public static void myMethod(int x){
		System.out.println("My Method(int)");
	}
	
	public static void myMethod(int x,int y){
		System.out.println("My Method(int,int)");
	}
	
	public static void myMethod(String s){
		System.out.println("My Method(String)");
	}
	
	public static void myMethod(String s,int x){
		System.out.println("My Method(String,int)");
	}
	
	public static void myMethod(int x,String s){
		System.out.println("My Method(String)");
	}
}



