package saiLearnsJava;
import java.util.Scanner;
public class Basic_Conversions {
	public static void main(String[] sai) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance between two cities in km");
		float km = sc.nextFloat();
		float m = (float)km*1000;
		float cm = (float)m*100;
		double inch= cm /2.54;
		
		double ft= inch/12;
	    System.out.println( "Distance in meters is:"+ m);
	    System.out.println( "Distance in centimeters is:"+ cm);
	    System.out.println( "Distance in inches is:"+ inch);
	    System.out.println( "Distance in feets is:"+ ft);
	    sc.close();
	    
		
	}

}
