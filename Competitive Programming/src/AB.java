import java.util.*;
public class AB {
	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
		int   []n = new  int[5];
		for(int i=0;i<5;i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(n[j]>=n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(" "+n[i]);
		}
}
}