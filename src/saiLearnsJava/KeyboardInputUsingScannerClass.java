package saiLearnsJava;
import java.util.Scanner;
public class KeyboardInputUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = scanner.nextLine();
	    System.out.println("what is your age");
	    int age = scanner.nextInt();
	    scanner.nextLine();
	    System.out.println("what is your favourite food");
	    
	    String food = scanner.nextLine();
	   
	    
	    
	    System.out.println("hello :"+ name );
	    System.out.println("you are "+ age+ "\n years old");
	    System.out.println("Your favourite food is "+ food);
        scanner.close();
        
	}

}
