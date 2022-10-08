package saiLearnsJava;
import java.util.Scanner;
public class BestOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your main marks ");
       int mainmarks = sc.nextInt();
       System.out.println("Did you write improvement?(y/n)");
       char answer= sc.next().charAt(0);
       if(answer=='y') {
    	   System.out.println("Enter improvement marks ");
    	   int impmarks = sc.nextInt();
    	   if(impmarks<mainmarks)
    		   System.out.println("final marks "+mainmarks);
    	   else 
    		   System.out.println("final marks "+impmarks);
       }
       else
    	   System.out.println("your final marks "+mainmarks);
       sc.close();
       
       
	}

}
