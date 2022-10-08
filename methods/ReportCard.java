package methods;
import java.util.Scanner;
public class ReportCard {

	 private Scanner sc;
	 private String name;
	 private int id;
	 
	  private void acceptData() {
		  System.out.println("enter Your Student name and Id");
		  name = sc.nextLine();
		  id = sc.nextInt();
		 
	 }
	 private void displayData() {
		 System.out.println("Student name is ; "+name +" Id is : "+id);
	 }
	 private int[]  acceptMarks() {
		 System.out.println("enter your marks out of 100 for 6 subjects ");
		 int marks[]=new int [6];
		 for(int i=0;i<marks.length;i++) {
			 marks[i]=sc.nextInt();
			
		 }
		 return marks;
		 
	 }
	 private void displayMarks(int marks[]) {
		 for(int x:marks ) {
			 System.out.println(x);
		 }
		 
	 }
	 private int  calculateAggregate(int marks[]) {
		 int sum=0;
		 for (int i=0;i<marks.length;i++) {
			sum=marks[i]+sum;
		 }
		 return sum;
		 
	 }
	 private float percentage(int sum) {
		 float per= (float)(sum*100)/600;
		 return per;
	 }
	 private void displayPerAndAggregate(float per, int sum) {
		 System.out.println("Percentage is "+per+" Aggregate is : "+sum);
	 }
	 private void displayGrade(float per) {
		 if(per>=95 && per<=100)
				System.out.println("Grade: A ");
			else if(per>=90 && per<=94)
				System.out.println("Grade: B ");
			else
				System.out.println("Grade: C ");
		 
	 }
	 private void Result(int marks[]) {
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
	 public void displayReport() {
		 sc = new Scanner(System.in);
		 this.acceptData();
		 int marks[]=this.acceptMarks();
		int total= this.calculateAggregate(marks);
		float per=this.percentage(total);
		System.out.println("Final Student Report is :  ");
		this.displayData();
		this.displayMarks(marks);
		this.displayPerAndAggregate(per, total);
		this.displayGrade(per);
		this.Result(marks);
	 }
public static void main(String[] ars) {
	ReportCard obj = new ReportCard();
	obj.displayReport();
	}
}
	

