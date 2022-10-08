package methods;

import java.util.Scanner;

public class Student {

	private Scanner scan;
	private String name;
	private int id;
	
	private void acceptStudentDetails()
	{
		System.out.println("Enter name,id");
		name=scan.nextLine();
		id=scan.nextInt();
		
	}
	
	private void displayStudentDetails()
	{
		System.out.println("Student Details:\nId: "+id+"\nName: "+name);
	}
	
	private int[] acceptMarks()
	{
		int marks[]=new int[6];
		System.out.println("Enter marks:");
		for(int i=0;i<marks.length;i++)
			marks[i]=scan.nextInt();
		
		return marks;
	}
	
	private int calculateTotalMarks(int marks[])
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
		           total=total+marks[i];
		return total;	
	}
	
	private float calculatePercentage(int total)
	{
		float per=(float)total/6;
		return per;	
	}
	
	private void displayMarks(int marks[])
	{
		System.out.println("Marks List: ");
		for (int i : marks) 
			System.out.println(i);
	}
	
	private void displayTotalPercentage(int total,float per)
	{
		System.out.println("Total Marks: "+total+"\nPercentage: "+per);
	}
	
	private void displayGrade(float per)
	{
		if(per>=95 && per<=100)
			System.out.println("Grade: A ");
		else if(per>=90 && per<=94)
			System.out.println("Grade: B ");
		else
			System.out.println("Grade: C ");
	}
	
	private void displayResult(int marks[])
	{
		String result="PASS";
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]<35)
			{
				result="FAIL";
				break;
			}
		}
		System.out.println("Result: "+result);
	}
	
	public void displayReport()
	{
		//scan=new Scanner(System.in);
		this.acceptStudentDetails();
		int marks[]=this.acceptMarks();
		int total=this.calculateTotalMarks(marks);
		float per=this.calculatePercentage(total);
		System.out.println("\t\t\tStudent Report card");
		this.displayStudentDetails();
		this.displayMarks(marks);
		this.displayTotalPercentage(total, per);
		this.displayGrade(per);
		this.displayResult(marks);
	}
	
	
}
// this is a keyword which refers to current object