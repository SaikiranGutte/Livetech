package saiLearnsJava;
import java.util.Scanner;
/*
 * Asking the user for his name until he fills anything and if he clicks enter 
 * without entering something as a input he will be prompted to enter his name again and again.
 */
public class While_Loop {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String name="";
		while(name.isBlank()) {
			System.out.println("Enter Your Name");
		    name = Sc.nextLine();
		}
		System.out.println("Hello "+name);
		  Sc.close();
	}
   
}
