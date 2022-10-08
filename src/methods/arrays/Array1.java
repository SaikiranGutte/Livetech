package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {20,30,50,81,60,40,22};
     System.out.println("printing all values of a");
     for(int i=0;i<a.length;i++) {
    	 System.out.println(a[i]);
     }
     System.out.println("Printing values of a using for-Each loop");
     for(int x: a) {
    	 System.out.println(x);
     }
}
}