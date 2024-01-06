import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		String[] name = { "Timur", " miurT", "Trumi", "mriTu" };
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char c = input.next().charAt(0);
		String str = "";
		{
			for (int i = 0; i < n; i++) {
				str = str + c;
			}
			System.out.println(str);

			int i;
			for (i = 0; i < name.length; i++) {
				if (str.equals(name[i])) {
					System.out.println("YES");
					break;
				}
			}
			
			if (i == name.length) {
				System.out.println("NO");
			}

		}

	}

}
