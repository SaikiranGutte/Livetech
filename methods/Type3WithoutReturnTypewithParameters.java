package methods;
import java.util.*;
public class Type3WithoutReturnTypewithParameters {

	public void product(int a, int b) {
		
		System.out.println("Type3 Product"+(a*b));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a b");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Type3WithoutReturnTypewithParameters obj= new Type3WithoutReturnTypewithParameters();
		obj.product(x,y);
	}

}
