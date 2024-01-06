import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t != 0) {
			int count = 0, i;
			
			int[] ara = new int[4];

			for (i = 0; i < 4; i++) {
				ara[i] = input.nextInt();
			}
			for (i = 1; i < 4; i++) {
				if (ara[0] < ara[i]) {
					count++;
				}
			}

			System.out.println(count);
			t--;
		}

	}
}