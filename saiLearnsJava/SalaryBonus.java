/*
a company decided to give bonus of 5% TO EMPLOYEEs if his/her year of service is more than 5 years , ask user for their salary and year of service and print the net 
bonus amount;


*/
package saiLearnsJava;
import java.util.Scanner;
public class SalaryBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your period of service in terms of years ");
      int service=sc.nextInt();
      System.out.println("enter your salary");
      int salary = sc.nextInt();
      if(service>=5)
      {
    	  System.out.println("congratulations you have got a raise of 5%");
    	  double bonus = salary*5/100;
    	  double currentSalary  = salary+bonus;
    	  System.out.println("Your cureent salary is "+currentSalary);
      }
      else
    	  System.out.println("No increment in the salary");
      sc.close();

	}
	
}
