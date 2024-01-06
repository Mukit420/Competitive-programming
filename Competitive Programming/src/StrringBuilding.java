import java.util.Scanner;

public class StrringBuilding {

	public static void main(String[] args) {
		int i;
      Scanner input= new Scanner(System.in);
      String str=input.nextLine();
      for( i=1;i<str.length()-2;i++) {
    	  if(str.charAt(i)!=str.charAt(i+1)) {
    		  if(str.charAt(i-1)!=str.charAt(i)||str.charAt(i+1)!=str.charAt(i+2)) {
    			  if(i==str.length()) {
    			 System.out.println("NO");
    			 
    		  }
    	  }
    	  else
			  System.out.println("YES");
      }

	}

}
}