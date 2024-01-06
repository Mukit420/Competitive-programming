import java.util.Scanner;

public class easy {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arra=new int[n];
		for(int i=0;i<n;i++) {
			arra[i]=sc.nextInt();
		}
         for(int i=0;i<n;i++) {
        	 
        	 if(arra[i]==1) {
        		 count++;
        		 break;
        	 }
         }
         if(count>0) {
        	 System.out.println("HARD");
         }
         else
        	 System.out.println("easy");
	}

}
