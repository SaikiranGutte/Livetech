package saiLearnsJava;
import java.util.Scanner;
public class Area_Rectange_Perimeter_Rectangle {
//ALSO THE AREA OF CIRCLE
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of Rectangle");
		float length = scanner.nextFloat();
		System.out.println("enter the breadth of Rectangle");
		float breadth = scanner.nextFloat();
		System.out.println("Enter the Radius of a circle");
		float radius = scanner.nextFloat();
		double CircleArea = 3.14*(radius)*radius;
		double area = (length * breadth);
		double perimeter = 2*(length+breadth);
		System.out.println("Area of Rectangle is :"+ area);
		System.out.println("Perimeter of Rectangle is  : "+ perimeter);
		System.out.println("Area of Circle is: "+CircleArea);
		scanner.close();
	}
 
}
