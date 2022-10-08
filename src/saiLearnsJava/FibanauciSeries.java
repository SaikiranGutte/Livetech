package saiLearnsJava;

public class FibanauciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=0,y=1;
      System.out.print(x+"\n"+y);
    int z;
      for(int i=2;i<=10;i++) {
    	  z=x+y;
    	  
    	  System.out.print("\n"+z);
    	     
    
     x=y;
     y=z;
     
      }
      
	}

}
