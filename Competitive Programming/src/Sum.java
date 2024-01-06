import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int[] a = new int[3];
while(n!=0) {
		for (int i = 0; i < 3; i++) {
			a[i] = input.nextInt();

		}
		System.out.println();
		if (a[0] + a[1] == a[2] || a[1] + a[2] == a[0] || a[0] + a[2] == a[1]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
         n--;
	}
	}
}
