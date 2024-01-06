import java.util.Scanner;

public class Bus {
	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			
			String res = "";
			for (int i = 0; i < n; i++) {
				res += in.next() + "\n";
			}
		if(res.contains("OO")) {
			System.out.println("YES");
			System.out.println(res.replaceFirst("OO","++"));
		}
		else
			System.out.println("NO");
		}
	}
