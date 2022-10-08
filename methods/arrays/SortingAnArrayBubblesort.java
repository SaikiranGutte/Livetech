package arrays;

import java.util.Scanner;

public class SortingAnArrayBubblesort {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size = sc.nextInt();
    int a[]= new int[size];
    System.out.println("enter the values");
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("your array is ");
    for(int x:a) {
    	System.out.println(x);
    }
    for(int i=1;i<a.length;i++)
    {
    	for(int j=0;j<a.length-i;j++) {
    		if(a[j]>a[j+1])
    		{
    	     int c =a[j];
    	     a[j]=a[j+1];
    	     a[j+1]=c;
    		}
    	}
    }
    sc.close();
    System.out.println("Array after sorting");
    for(int x:a)
    	System.out.println(x);
	}

}
