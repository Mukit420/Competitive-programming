import java.util.Scanner;

public class king_Moves {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		String str=sc.next();
		
		if(str.charAt(0)=='a'|str.charAt(0)=='h'|str.charAt(1)-'0'==8|str.charAt(1)-'0'==1 ) {
			if(str.charAt(0)=='a'&str.charAt(1)-'0'==8|str.charAt(0)=='h'&str.charAt(1)-'0'==8|
					str.charAt(0)=='a'&str.charAt(1)-'0'==1|str.charAt(0)=='h'&str.charAt(1)-'0'==1	) {
				System.out.println(3);

			}
			else
			System.out.println(5);
			
		}
		else {
			System.out.println(8);
		}
	}
}

