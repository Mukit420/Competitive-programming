import java.util.LinkedList;
import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		LinkedList<Integer> in = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int count1 = 0, count2 = 0, count3 = 0;
			int[] ara = new int[n];
			for (int i = 0; i < n; i++) {
				ara[i] = sc.nextInt();
				if (ara[i] % 2 != 0) {
					count1++;
				} else
					count2++;
			}

			if (count1 == n) {
				System.out.println(0);
			}
			int sum = 0;
			if (count2 > 0) {
				if (count2 == n) {
					for (int i = 0; i < n; i++) {
						int n1 = ara[i];
						sum += n1;
					}
					
					for(int i=0;i<sum;i++) {
						int number1=sum/2;
						sum=number1;
						int sum1=sum;
						count3++;
						if(sum%2!=0) {
							break;
						}
						
						
					}
					System.out.println(count3+(n-1));
				}
					
				

				else {
					System.out.println(count2);
				}
			}

		}
	}

}
