import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		String str = "";
		for (char c = 'a'; c <= 'z'; c++) {
			str += c;
		}
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int[] ara = new int[st.length()];
		int pos, i, j, count = 0,count1=0;
		for (i = 0; i < st.length(); i++) {

			pos = str.indexOf(st.charAt(i));

			if (count == st.length()) {
				break;
			}

			ara[count] = pos;
			count++;
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (count1 == ara.length) {
					break;
				}
				mat[i][j] = ara[count1];
				System.out.print(" " + mat[i][j]);
				count1++;
			}
			System.out.println();
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (count1 == ara.length) {
					break;
				}
				 ara[count1]=mat[i][j] ;
				
				count1++;
			}
			
		}
		System.out.print(" " +ara[count1]); 

	}
}