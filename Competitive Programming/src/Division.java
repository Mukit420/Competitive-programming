import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int t = input.nextInt();
		while (t--> 0) {
			
			int rating1 = input.nextInt();
			if (rating1 >= 1900 & rating1 <= 5000) {

				System.out.println("Division 1");
				
			}
			if (rating1 >= 1600 & rating1 <= 1899) {
				System.out.println("Division 2");
				
			}
			if (rating1 >= 1400 & rating1 <= 1599) {
				System.out.println("Division 3");
				
			}
			if (rating1 <= 1399 & rating1 >= -5000) {
				System.out.println("Division 4");
				
			}

		}

	}
}