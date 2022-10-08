package saiLearnsJava;
import java.util.Scanner;
public class Greatestof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a b c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is Greater");
		}
		else if(b>c) {
		System.out.println("b is Greater");	
		}
		else 
			System.out.println("C is Greater");
		   sc.close();
	}

}
