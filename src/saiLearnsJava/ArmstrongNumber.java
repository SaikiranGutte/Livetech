package saiLearnsJava;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number ");
 int n = sc.nextInt();
 int i =n;
 int sum = 0;
 while(n>0) {
	 int rem = n%10;
	 sum=sum+rem*rem*rem;
	 n/=10;
 }sc.close();

 if(sum==i)
	 System.out.println(i+" is an Armstrong number ");
 else 
	 System.out.println("not an Armstrong number");
	}
	
}
