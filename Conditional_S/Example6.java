import java.util.*;

class Example6{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		
			System.out.print("Enter Student Name :");
			String name = input.next();
			
			System.out.print("Enter Student Address :");
			String address = input.next();
			
			System.out.print("Enter Number of Subject :");
			int no_of_subject = input.nextInt();
			
			System.out.println();
			int []marks = new int [no_of_subject];
			
			for (int i=0;i<no_of_subject;i++){
					System.out.print("Enter Subject : "+(i + 1) + " Marks :");
					marks[i] = input.nextInt();
			}
			System.out.println();
			
			System.out.println("A. Show Student Details.");
			System.out.println("B. Show All Marks.");
			System.out.println("A. Show All Result.");
			
			System.out.println();
			
			System.out.println("-->");
			String letter = input.next();
			
			switch(letter){
				case "A":
						System.out.println("Student name is :" + name);
						System.out.println("Student address is :" + address);
						break;
				case "B":
						System.out.println("All Marks :");
						
						for (int i =0;i <marks.length;i++){
							System.out.println(marks[i] + " ");
						}
						System.out.println();
						break;
				case "C":
						int total =0;
						
						for (int i =0;i < marks.length;i++){
							total=total +marks[i];
						}
						double avarage = (double)total / no_of_subject;
						
						if (avarage >= 50){
							System.out.println("Pass..");
						}else {
							System.out.println("Fail..");	
						}
						break;
				default:
						break;
			}
			
	
}
}