package saiLearnsJava;

import java.util.Scanner;

public class ReverseOfnumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Value ");
	     int a = sc.nextInt();
	     int sum=0;
	     int rem;
	     while(a>0){
	    	  rem = a%10;//Remainder Gives me the unit digit
	    	 
	    	  //System.out.println(rem);
	    	 
	    	 sum = sum+rem*rem*rem;//
	    	 a= a/10;//   again updating my input value so it can go to next iteration
	    	
	     } System.out.println(sum);
	     sc.close();
	}

}
