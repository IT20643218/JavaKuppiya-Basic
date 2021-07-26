/* two deimentional Array*/

import java.util.*;

class Array1{
		public static void main (String args[]){
			Scanner input = new Scanner(System.in);
			
			int[][] marks = new int[3][5];
			
			marks[0][0] = 80;
			marks[0][1] = 95;
			marks[0][2] = 85;
			marks[0][3] = 65;
			marks[0][4] = 100;
			
			marks[1][0] = 60;
			marks[1][1] = 75;
			marks[1][2] = 95;
			marks[1][3] = 55;
			marks[1][4] = 90;
			
			marks[2][0] = 50;
			marks[2][1] = 65;
			marks[2][2] = 25;
			marks[2][3] = 45;
			marks[2][4] = 50;
			
			for (int i =0;i<marks.length;i++){
				for (int j=0;j<marks[i].length;j++){
					System.out.print(marks[i][j]+" ");
				}
				System.out.println();
			}
					
		}
	
}