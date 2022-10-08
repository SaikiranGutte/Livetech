package saiLearnsJava;
import java.util.Scanner;
public class CheckIfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the length of the figure");
   int l = sc.nextInt();
   System.out.println("Enter the breadth of the figure");
   int b = sc.nextInt();
   
if (l==b)
	System.out.println("The figure is square ");
else 
	System.out.println("not a square");
   }

}
