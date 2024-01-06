import java.util.Scanner;

public class Equal_candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int[] ara = new int[n];
			
			for (int i = 0; i < n; i++) {
				ara[i] = sc.nextInt();
			}
			int least = ara[0];
			for (int i = 1; i < n; i++) {
				if(least>=ara[i]) {
					least=ara[i];
				}
			}

			for (int i = 0; i < n; i++) {
					ara[i] = (least - ara[i]);
					// System.out.println(ara[i]);

				}

			
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += ara[i];
			}
			if(sum<0) {
				System.out.println(-sum);
			}
			else
			  System.out.println(sum);

		}

	}

}
