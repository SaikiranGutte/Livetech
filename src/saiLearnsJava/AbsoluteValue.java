package saiLearnsJava;
import java.util.Scanner;
import java.lang.Math;
public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value ");
    int a = sc.nextInt();
   // int s= Math.abs(a);
   // System.out.println(s);
    if(a<0)
   {   System.out.println("-a is "+(-a));
    
   }
    else 
    	System.out.println(" a is "+a);
    }
   
	}



