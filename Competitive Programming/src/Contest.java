import java.util.Scanner;

public class Contest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int []ara=new int[3];
		for(int i=0;i<3;i++) {
			ara[i]=in.nextInt();
		}
        if(ara[0]<=ara[1]&ara[0]<=ara[2]) {
        	System.out.println("YES");
        }
        else
        	System.out.println("NO");
	}

}
