package saiLearnsJava;
import java.util.Scanner;
public class AggregateMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner marks = new Scanner(System.in);
    
      System.out.println("enter marks obtained in this subject m1");
      
      
      int m1 = marks.nextInt();
      if(m1>100) {
    	  for(m1=101;m1>=101;m1++){
         
      System.out.println("marks cannot exceed 100");
      System.out.println("enter valid marks of m1");
      m1 = marks.nextInt();
      if(m1<=100) {
      System.out.println("Enter marks in m2");
      break;
                  }
                                  }
    	        }
    	  
      else {
      System.out.println("Enter marks in m2");
          }
        
      int m2 = marks.nextInt();
      if(m2>100) {
    	  for(m2=101;m2>=101;m2++){
         
      System.out.println("marks cannot exceed 100");
      System.out.println("enter valid marks of m2");
      m2 = marks.nextInt();
      if(m2<=100) {
      System.out.println("Enter marks in m3");
      break;
                  }
                                   }
    	         }
    	  
      else {
      System.out.println("Enter marks in m3");
           }
    	  
      int m3 = marks.nextInt();
      if(m3>100) {
    	  for(m3=101;m3>=101;m3++) {
          
       System.out.println("marks cannot exceed 100");
       System.out.println("enter valid marks m3");
       m3 = marks.nextInt();
       if(m3<=100) {
       System.out.println("enter marks obtained in this subject m4");
       break;
                   }
    	                           }
                 }
      else {
            
      System.out.println("enter marks obtained in this subject m4");
           }
      int m4 = marks.nextInt();
      if(m4>100) {
    	  for(m4=101;m4>=101;m4++) {
       System.out.println("marks cannot exceed 100");
       System.out.println("enter valid marks of m4");
       m4 = marks.nextInt();
       if(m4<=100) {
       System.out.println("enter marks obtained in this subject m5");
       break;
                   }
                                   }
                 }
      else {
                            	
        System.out.println("enter marks obtained in this subject m5");
           }
        int m5 = marks.nextInt();
     
      if(m5>100) {
    	  for(m5=101;m5>=101;m5++) {
       System.out.println("marks cannot exceed 100");
       System.out.println("enter valid marks of m5");
       m5 = marks.nextInt();
       if(m5<=100) {
 	  int agr = m1 + m2 + m3 + m4 + m5;
	  float per = (float)agr/5;
System.out.println("Aggregate marks are :"+agr+ " and percentage is "+per);  
break;
                   }	 
                                    }
                }
      else {
    	  int agr = m1 + m2 + m3 + m4 + m5;
    	  float per = (float)agr/5;
    System.out.println("Aggregate marks are :"+agr+ " and percentage is "+per);     
   
           }
      marks.close();            		   
                        
         
	}
	           	  
     
}
