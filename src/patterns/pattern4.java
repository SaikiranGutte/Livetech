package patterns;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=4;i>=1;i--) {
    	   for(int space=4;space>i;space--)
    		   System.out.print("**");
    	   for(int j=i;j>=1;j--) {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

}
