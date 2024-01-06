import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			char c = sc.next().charAt(0);
			String str = sc.next();
			int pos1 = 0;
			int pos2 = 0;
			int pos3 = 0;
			int pos4=0;
			int i;
			if (c == 'g') {
				System.out.println(0);
			} else {
				for (i = n - 1; i >= 0; i--) {
					if (str.charAt(i) == c) {
						pos1 = i;
						break;
					}
				}
				for (i = 0; i < n; i++) {
					if (str.charAt(i) == c) {
						pos2 = i;
						break;
					}
				}
				for (i = n - 1; i >= 0; i--) {
					if (str.charAt(i) == 'g') {
						pos3 = i;
					break;
					}
					}
				for (i = 0; i < n; i++) {
					if (str.charAt(i) == 'g') {
						pos4 = i;
						break;
					}
				}
				
                 if(pos2+1==pos1) {
                	System.out.println(pos3); 
                 }
				if (pos2+1!=pos1&pos1<pos3) {
					System.out.println(pos3-pos1);
				}

	             if(pos1>pos3&pos2+1!=pos1&pos4+1!=pos3)
				  
				  System.out.println((n - pos1 + pos4)); 
	             }
			if(pos1>pos3&pos2+1!=pos1&pos4+1==pos3)
				  
				  System.out.println((n - pos1 + pos3)); 
	             }
				 
			}

		

	}
