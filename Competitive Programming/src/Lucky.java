import java.util.Scanner;
	public class Lucky {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int t = input.nextInt();
	        while (t-- > 0) {
	            String s = input.next();
	 
	            if ((s.charAt(0) + s.charAt(1) + s.charAt(2)) == (s.charAt(3) + s.charAt(4) + s.charAt(5))) {
	                System.out.println("YES");
	            } else {
	                System.out.println("NO");
	            }
	        }
	    }
	}