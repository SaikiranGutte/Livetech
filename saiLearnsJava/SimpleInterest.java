package saiLearnsJava;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the Principle");
		float p= sc.nextFloat();
	     System.out.println("Enter the Time duration");
	     
		int t = sc.nextInt();
	     System.out.println("what is the rate of Interest");
		float r = sc.nextFloat();
		double SI = (float)(p*t*r)/100;
	
	   
      System.out.println("Simple interest is "+SI);
      sc.close();
	}

}
