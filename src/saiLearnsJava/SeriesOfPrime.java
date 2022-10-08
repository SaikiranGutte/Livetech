package saiLearnsJava;
import java.util.Scanner;
public class SeriesOfPrime {

	public static void main(String[] args)
	{
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the range of numbers to check how many prime numbers exists between them");
     int lw= sc.nextInt();
     int up= sc.nextInt();
     for (int n=lw;n<=up;n++)
     {
    	 int factors=0;
          System.out.println("factors of "+n);
    	 for(int i=1;i<=n;i++) {
    		 if(n%i==0) {
    			 factors+=1;
    		 }
    		
    	
    	 }
    	 System.out.println("no of factors of "+n+"  is  "+factors);
    
    	 if(factors==2)
    		 System.out.println(n+" is a Prime ");
    	 else
    		 System.out.println(n+"  is not a prime");
    	 sc.close();
     }
     
	}

}
