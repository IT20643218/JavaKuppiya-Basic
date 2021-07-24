
import java.util.*;

class Example5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		
		
		boolean flag = true;
		
		while(flag){
			
		System.out.print("Do you want to enter Student Details..? (Y/N) :");
		String letter  = input.next();
		
		switch(letter){
			case "Y":
				System.out.print("Enter Student Name :");
				String name = input.next();
				
				System.out.print("Enter Student Address :");
				String address = input.next();
				
				System.out.print("Enter Number of Subjects :");
				int number_of_subjects = input.nextInt();
				
				System.out.println("");
				
				int total = 0;
				
				for(int i =0;i < number_of_subjects;i++ ){
					System.out.println("Enter Subject : "+(i + 1) + "Marks :");
					int marks = input.nextInt();
					
					total = total + marks;
				}
				System.out.println("");
				
				boolean flag2 = true;
				
				while(flag2){
				System.out.println("A. Show Student Details");
				System.out.println("B. Show Total Marks");
				System.out.println("C. Show Avarage Marks");
				System.out.println("D. Show Result");
				System.out.println("X. Exit");
				
				System.out.println("");
				
				System.out.println("-->");
				String option = input.next();
				
				double avarage = (double)total / number_of_subjects;
				
				switch(option){
					case "A":
							System.out.println("Student Name is : " + name);
							System.out.println("Student Address is : " +  address);
						break;
					case "B":
							System.out.println("Total Marks : " + total);
						break;
					case "C":
							System.out.println("Avarage Marks is :" + avarage);
						break;
					case "D":
							if(avarage >= 50){
								System.out.println("Pass..");
							}else{
								System.out.println("Fail..");
							}
						break;
					case "X":
							flag2 = false;
						break;
					default:
							System.out.println("Invalid Entry....");
				}
				}
				
				break;
			case "N":
					flag = false;
				break;
			default:
				System.out.println("Invalid Entry....");
			}
			System.out.println("");
		}
		
	}


}