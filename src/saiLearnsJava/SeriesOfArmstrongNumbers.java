package saiLearnsJava;
import java.util.Scanner;
public class SeriesOfArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the range of numbers for which you wanted the series of Armstrong Numbers");
    int lw =sc.nextInt();
    int up= sc.nextInt();
    int count=0;
    for(int i=lw;i<=up;i++)
    {   int n=i;
    	int sum =0;
    	
    	//int count=0;
        
        	while(n>0) {
        		int rem=n%10;
        		sum=sum+rem*rem*rem;
        		n/=10;
        		
        	}
        	System.out.println(sum);
        	if(sum==i) {
        
        		System.out.println(i+" is an Armstrong Number");
        	    count++;
        	   
        	    }
        	
        sc.close();
    }  
    if(count==0) {
		System.out.println("no armstrong number in given range");
		

	}
	else 
		System.out.println("total armstrong numbers are "+count);

    
	}

}
