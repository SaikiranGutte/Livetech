package saiLearnsJava;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String x = "Saikiran";
     String y = "Bharath";
     x = x+y;
     y = x.substring(0,x.length()-y.length());
    
     System.out.println("y: "+ y);
     x = x.substring(y.length());
     System.out.println("x: "+ x);
     // SWAP using a temp variable;
    //  String temp = x;
    // x=y;
    // y=temp;
  /* SWAP without using any third variable
   * int x =20; 
   * int y= 30;
   * x= x+y;
   * y=x-y;
   * x=x-y
   * 
   * print(X);
   * 
   * 
   */
 

   
	}

}
