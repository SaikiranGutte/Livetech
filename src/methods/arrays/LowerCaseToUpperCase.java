package arrays;
import java.util.Scanner;
public class LowerCaseToUpperCase {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the lower case string");
    String s= sc.nextLine();
    System.out.println("Your entered string is : "+s);
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++) {
    int x=(int)ch[i];
    if(ch[i]>='a'&&ch[i]<='z') {
    	x = x-32;
        ch[i]=(char)x;
    }
   
    }
    s = new String(ch);
    System.out.println(s);
	}

}
