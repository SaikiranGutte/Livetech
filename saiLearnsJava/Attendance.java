package saiLearnsJava;
import java.util.Scanner;
public class Attendance {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of classes Held");
			int tc= sc.nextInt();
			System.out.println("Enter classes attended");
			int ta= sc.nextInt();
			if(ta>tc) {
				for( ta=tc+1;ta>tc;ta++) {
					//System.out.println(ta);
					++ta;
					//System.out.println(ta);

					System.out.println("total attended classes cannot be more than total held classes\n Enter valid Input");
			            ta= sc.nextInt();
			            --ta;
			          // System.out.println(ta);
			           //System.out.println(tc);
			            if(ta>tc) {
							System.out.println("total attended classes cannot be more than total held classes\n Enter valid Input");
							ta= sc.nextInt();
							--ta;
						
						
				        } 
			           
			            
				}
				sc.close();
				}
			else {
			 //System.out.println(ta);
			// System.out.println(tc);
			double per= (double)ta/tc*100;
			
			System.out.println(per);
			}
double per= (double)ta/tc*100;
			
			System.out.println("percentage is "+per);
		}
	}
}
