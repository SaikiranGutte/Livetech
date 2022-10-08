package saiLearnsJava;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   int num = sc.nextInt();
   int factors=0;
   for( int i=1;i<=num;i++) {
	   if(num%i==0) {
		   System.out.println(i);
	       factors+=1;
	   }
                            }
   System.out.println("total factors "+factors);
   if(factors==2)
	   System.out.println("The given number "+num +" is a Prime Number");
   else 
	   System.out.println(num+" has more than 2 factors \n So It is not a Prime Number ");
	}

}
