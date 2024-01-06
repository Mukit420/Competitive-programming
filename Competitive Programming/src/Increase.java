import java.util.Scanner;

public class Increase {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ara = new int[n];
		for (int i = 0; i < n; i++)
			ara[i] = sc.nextInt();
		int len=1,maxlen=1;
		for(int i=0;i<n-1;i++) {
			if(ara[i]<ara[i+1]) {
				len++;
				if(maxlen<len) {
					maxlen=len;
				}
			}
			else
				len=1;
		}
		System.out.println(maxlen);
	}
}