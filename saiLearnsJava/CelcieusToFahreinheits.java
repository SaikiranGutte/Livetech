package saiLearnsJava;
import java.util.Scanner;

public class CelcieusToFahreinheits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in Fahreinheits");
    float fr = sc.nextFloat();
    double cent= 5.0/9.0*((double)fr-32);
    System.out.println(cent);
	sc.close();
	}


	
	
}
