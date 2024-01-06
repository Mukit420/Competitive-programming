import java.util.Scanner;

public class Mishka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ara = new int[n][2];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				ara[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 1; j++) {
				if (ara[i][j] > ara[i][j + 1]) {
					count++;
				}
				if (ara[i][j] < ara[i][j + 1]) {
					count--;
				}

			}

		}

		if (count > 0) {
			System.out.println("Mishka");

		}
		if (count < 0) {
			System.out.println("Chris");
		}
		if (count == 0) {
			System.out.println("Friendship is magic!^^");
		}
	}

}