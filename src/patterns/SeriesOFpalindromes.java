package patterns;
import java.util.Scanner;
public class SeriesOFpalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int lw=sc.nextInt();
int up=sc.nextInt();
int x=1%10;
System.out.println(x);
int rev;
int n;
for (int i=lw;i<=up;i++) {
	 n=i;
	  rev=0;
	while(n>0) {
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	if(i==rev) {
		System.out.print(i+" ");
	}
}



	}

}
