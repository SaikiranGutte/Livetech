package arrays;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s = sc.nextLine();
	String k= s;
	System.out.println(k);
	char ch[]= s.toCharArray();
	System.out.println("String before reversing  "+ s);
	int j=ch.length-1;
	for(int i=0;i<ch.length/2;i++)
	{
		int c= ch[i];
		ch[i]=ch[j];
		ch[j]=(char)c;
		j--;
		
	}
	 s = new String(ch);
	System.out.println("after reversing "+s);
	if(s.equals(k)) 
	System.out.println("Entered String is a palindrome");
	}

}
