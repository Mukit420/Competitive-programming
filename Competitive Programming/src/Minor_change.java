import java.util.Scanner;
import java.util.LinkedList;

class Minor_change {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 Long n = sc.nextLong();
		Double d = sc.nextDouble();
		Double d1 = n * d;
		Double newData = new Double(d1);
		 Long  value = newData.longValue();
		System.out.println(value);
	}

}
