
import java.util.*;

public class Nearest_Interesting_Number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			a = b;
			sum = 0;
			while (a != 0) {
				sum += a % 10;
				a = a / 10;
			}
			if (sum % 4 == 0) {
				System.out.println(b);
				break;
			}
			b++;
		}

	}

}