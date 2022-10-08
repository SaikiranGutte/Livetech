package arrays;
import java.util.Scanner;
public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the Size of the array");
   int size = sc.nextInt();
   int a[]= new int[size];
   System.out.println("enter the valiues in the array");
   for(int i=0;i<a.length;i++) {
	   a[i]= sc.nextInt();
   }
   System.out.println("array before reversing is ");
    for(int x: a) {
    	System.out.println(x);
    }
    int j=a.length-1;
    for(int i=0;i<a.length/2;i++) {
    	int c= a[i];
    	a[i]=a[j];
    	a[j]=c;
    	j--;
    	
    }
    System.out.println("array after sorting is ");
    for(int x: a) {
    	System.out.println(x);
    }
    sc.close();
	}

}
