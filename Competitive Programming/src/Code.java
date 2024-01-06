import java.util.LinkedList;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			LinkedList<String> in = new LinkedList<String>();
			String alpha = " abcdefghijklmnopqrstuvwxyz";
			int n1=sc.nextInt();
			String str = sc.next();
			String str1 = "";
			for (int i = str.length() - 1; i > -1; i--) {
				if (str.charAt(i) - '0' == 0) {
					char c = str.charAt(i - 1);
					char c1 = str.charAt(i - 2);
					str1 += c1;
					str1 += c;
					in.add(str1);
					str1="";
					i=i-2;
				}

				else {
					str1 += str.charAt(i);
					in.add(str1);
					str1="";
				}
			}
			String str2="";
			for(int i=in.size()-1;i>=0;i--) {
				int n=Integer.parseInt(in.get(i));
				char c=alpha.charAt(n);
				str2+=c;
			}
			System.out.println(str2);
		}

	}
}
