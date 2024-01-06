import java.util.Scanner;

public class Tokitsukaze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			char[]c=str.toCharArray();
			int count1 = 0;
			for(int i=0;i<n;i+=2) {
				if(c[i]!=c[i+1]) {
					count1++;
				}
			}
			System.out.println(count1);

		}
	}
}