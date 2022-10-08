package saiLearnsJava;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter values of a and b");
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("enter the operator");
     char operator = sc.next().charAt(0);
     switch(operator)
     {
     case '+':System.out.println("Adding a and b gives "+(a+b));
     break;
     case '-':System.out.println("subtracting b from a "+(a-b));
    	 break;
     case '*':System.out.println("multiplying a and b"+(a*b));
    	 break;
    	 default: System.out.println("Enter a valid operator");
     }
     sc.close();
     
	}

}
