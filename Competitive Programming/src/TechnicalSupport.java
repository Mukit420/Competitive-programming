import java.util.Scanner;

public class TechnicalSupport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int len = sc.nextInt();
			String str = sc.next();
			int c1 = 0;
			for (int i = 0; i < len ; i++) {
			
				if (str.charAt(i) == 'Q') {
					c1++;
				} else
					c1--;
				if (c1 <=0) {
					c1 = 0;
				}
			
			}
			
			if (c1 > 0) {
				System.out.println( "No");
			} else
				System.out.println("Yes");

		}
	}
}
