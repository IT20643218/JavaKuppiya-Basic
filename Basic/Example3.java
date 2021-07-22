import java.util.*;

class Example3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Salary :");
		int salary =input.nextInt(); 
		
		int note = salary / 5000;
		salary = salary % 5000;
		System.out.println("5000 Notes :"+ note);
		
		note = salary / 2000;
		salary = salary % 2000;
		System.out.println("2000 Notes :"+ note);
		
		note = salary / 1000;
		salary = salary % 1000;
		System.out.println("1000 Notes :"+ note);
		
		note = salary / 500;
		salary = salary % 500;
		System.out.println("500 Notes :"+ note);
		
		note = salary / 100;
		salary = salary % 100;
		System.out.println("100 Notes :"+ note);
		
		note = salary / 50;
		salary = salary % 50;
		System.out.println("50 Notes :"+ note);
		
		note = salary / 20;
		salary = salary % 20;
		System.out.println("20 Notes :"+ note);
		
		int coin = salary / 10;
		salary = salary % 10;
		System.out.println("10 Coins :"+ coin);
		
		coin = salary / 5;
		salary = salary % 5;
		System.out.println("5 Coins :"+ coin);
		
		coin  = salary / 2;
		salary = salary % 2;
		System.out.println("2 Coins :"+ coin);
		
		coin  = salary / 1;
		salary = salary % 1;
		System.out.println("1 Coins :"+ coin);
		
		
		
	}

}