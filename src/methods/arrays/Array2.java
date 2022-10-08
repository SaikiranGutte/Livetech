package arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter the array size");
int size = sc.nextInt();
int marks[]=new int [size];
System.out.println("enter marks in each subject");
for (int i=0;i<marks.length;i++) {
	
	marks[i]=sc.nextInt();
}
	
 for(int x: marks) {
	 System.out.println("Your entered marks are: ");
	 System.out.println(x);
 }
}
}