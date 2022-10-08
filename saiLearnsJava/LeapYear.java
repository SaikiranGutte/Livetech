package saiLearnsJava;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Year");
      int Year = sc.nextInt();
      
      if(Year%400 == 0) {
    	  System.out.println(Year+" is a leap year");
      }
      else if(Year%100 ==0) {
    	  System.out.println(Year+"is not a leap year");
      }
    	  
             
      else if(Year%4==0){
    	  System.out.println(Year+"is a leap year");
      }
      else {
    	  System.out.println("Not a leap year");
      }
  	sc.close();
	}


}
