import java.util.LinkedList;
import java.util.Scanner;

public class Brain_Photos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Character> in = new LinkedList<>();
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] arra = new char[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arra[i][j] = sc.next().charAt(0);
				in.add(arra[i][j]);

			}
		}
		int count=0;
		for (int i = 0; i < r * c; i++) {
			
			if (in.get(i)=='B'|| in.get(i) == 'G' ||in.get(i) == 'W') {
				count++;	
				
		}
			
		}
		if(count==r*c) {
			System.out.println("#Black&White");
		}
		else {
			System.out.println("#Color");
		}
	}
}

