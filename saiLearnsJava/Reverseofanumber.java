package saiLearnsJava;
import java.util.Scanner;


public class Reverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number to reverse it");
     int num = sc.nextInt();
     int temp=num;
     int rev = 0;
     while(num>0)
     {
    	 int rem = num%10;
    	 rev= rev*10+rem;
    	 num=num/10;
     }
   
     System.out.println("Reverse of number "+temp+" is "+rev);
     if(rev==temp)
     {
    	 System.out.println(rev+"is a palindrome");
     }
     else
    	 System.out.println("not a palindrome");
     sc.close();
	}

}
