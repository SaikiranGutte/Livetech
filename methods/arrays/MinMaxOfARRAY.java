package arrays;
import java.util.Scanner;
public class MinMaxOfARRAY {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how many subjects have you got");
		int marks = sc.nextInt();
		int s[]= new int[marks];
		System.out.println("enter the marks subject wise");
		for(int i=0;i<s.length;i++)
			s[i]=sc.nextInt();
	
           for(int x:s) {
    	 System.out.println(x);
                         }
    	 int min = s[0];
    	 int max = s[0];
    	 for(int i=0;i<s.length;i++)
    	 {
    		 if(min>s[i])
    			 min=s[i];
    		 if(max<s[i])
    			 max=s[i];
    	 }
    	 System.out.println("minimum is "+min);
    	 System.out.println("maximum is "+max);
    	 sc.close();


}
}