import java.util.Scanner;

public class FixedString {

	public static void main(String[] args) {
     int L;
     char C;
     String str="";
     Scanner input=new Scanner(System.in);
     L=input.nextInt();
     C=input.next().charAt(0);
    
     for(int i=0;i<L;i++) {
    	 
    	 str=str+C;
     }
     System.out.println(str);
	}

}
