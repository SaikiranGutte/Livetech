package saiLearnsJava;
import java.util.Scanner;
public class ElseIfGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the score in level 1");
  int score = sc.nextInt();
  if (score>=1000) {
	  System.out.println("congratulations you have completed level-1 \n enter score of level-2");
	  score = sc.nextInt();
	       if(score>=3000) {
	    	  System.out.println("congratulations you have completed level-2 \n enter score of level-3");
	    	   score= sc.nextInt();
	    	      if(score>=9000)
	    	    	  System.out.println("congratulations you have won the game ");
	    	      else 
	    	    	  System.out.println("SO close , try harder");
	       }
	       else {
	    	   System.out.println("better luck next time");
	       }
	  
                   }
  else {
	  System.out.println("better luck next time");
	 
       }
  sc.close();
	}

}
